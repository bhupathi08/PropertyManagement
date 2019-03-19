package com.stanley.PropertyManagement.utils;

import com.stanley.PropertyManagement.model.Property;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


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

}