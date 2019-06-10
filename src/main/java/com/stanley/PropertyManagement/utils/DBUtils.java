package com.stanley.PropertyManagement.utils;

import com.stanley.PropertyManagement.model.Property;
import com.stanley.PropertyManagement.model.User;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class DBUtils {

	public static void insertProperty(Connection conn, Property property) throws SQLException {
		String sql = "Insert into Property(title, location, landmark, area, price) values (?,?,?,?,?)";

		PreparedStatement pstm = conn.prepareStatement(sql);

		pstm.setString(1, property.getTitle());
		pstm.setString(2, property.getLocation());
		pstm.setString(3, property.getLandmark());
		pstm.setString(4, property.getArea());
		pstm.setString(5, property.getPrice());

		pstm.executeUpdate();
	}

	public static void insertUser(Connection conn, User user) throws SQLException {
		String sql = "Insert into User(first_name, last_name, email, username, password) values(?,?,?,?,?)";
		PreparedStatement p = conn.prepareStatement(sql);

		p.setString(1, user.getFirstName());
		p.setString(2, user.getLastName());
		p.setString(3, user.getEmail());
		p.setString(4, user.getUsername());
		p.setString(5, user.getPassword());

		p.executeUpdate();
	}

	public static Boolean validateLogin(Connection conn, User user) throws SQLException {
		Statement st = conn.createStatement();
		ResultSet rs = st.executeQuery("Select * from User where username='" + user.getUsername() + "'and password='"
				+ user.getPassword() + "'");
		if (rs.next()) {
			return true;
		} else {
			return false;
		}
	}

	public static List<Property> displayProperty(Connection conn) throws SQLException {
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

			prop.add(tempProp);
		}
		return prop;
	}

}