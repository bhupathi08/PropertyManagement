package com.stanley.PropertyManagement.dao.implementation;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.stanley.PropertyManagement.dao.PropertyDao;
import com.stanley.PropertyManagement.domain.Property;

public class PropertyDaoImpl implements PropertyDao {
	public void insertProperty(Connection conn, Property property) throws SQLException {
		String sql = "Insert into Property(title, location, landmark, area, price, image, contact_number) values (?,?,?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, property.getTitle());
		pstm.setString(2, property.getLocation());
		pstm.setString(3, property.getLandmark());
		pstm.setString(4, property.getArea());
		pstm.setString(5, property.getPrice());

		File image= new File(property.getImage());
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(image);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		pstm.setBinaryStream(6, (InputStream) fis, (int) (image.length()));
        pstm.setString(7,property.getContactNumber());
		pstm.executeUpdate();
	}
	
	public List<Property> displayProperty(Connection conn) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from Property");
		List<Property> prop = new ArrayList<Property>();
		while (rs.next()) {
			Property tempProp = new Property();

			tempProp.setId(Integer.parseInt(rs.getString("id")));
			tempProp.setTitle(rs.getString("title"));
			tempProp.setLocation(rs.getString("location"));
			tempProp.setLandmark(rs.getString("landmark"));
			tempProp.setArea(rs.getString("area"));
			tempProp.setPrice(rs.getString("price"));
			tempProp.setImage(rs.getString("image"));
            tempProp.setContactNumber(rs.getString("contact_number"));
			prop.add(tempProp);
		}
		return prop;
	}
}
