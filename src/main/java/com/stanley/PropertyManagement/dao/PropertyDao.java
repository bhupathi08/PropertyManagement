package com.stanley.PropertyManagement.dao;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import com.stanley.PropertyManagement.domain.Property;

public interface PropertyDao {
	
	public void insertProperty(Connection conn, Property property) throws SQLException;
	
	public List<Property> displayProperty(Connection conn) throws SQLException;
}
