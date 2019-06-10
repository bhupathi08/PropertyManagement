package com.stanley.PropertyManagement.manager.implementation;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

import com.stanley.PropertyManagement.conn.ConnectionUtils;
import com.stanley.PropertyManagement.dao.PropertyDao;
import com.stanley.PropertyManagement.dao.implementation.PropertyDaoImpl;
import com.stanley.PropertyManagement.domain.Property;
import com.stanley.PropertyManagement.manager.PropertyManager;

public class PropertyManagerImpl implements PropertyManager {
	
	public String addProperty(Property property) {
	 Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}

     String errorString = null;
    
     if (errorString == null) {
         try {
             PropertyDao propertyDao = new PropertyDaoImpl();
             propertyDao.insertProperty(conn, property);
         } catch (SQLException e) {
             e.printStackTrace();
             errorString = e.getMessage();
         }
     }
     
     return errorString;

   }

	public List<Property> displayProperties() {
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		List<Property> prop = new ArrayList<Property>();
		 
         try {
        	 PropertyDao propertyDao = new PropertyDaoImpl();
			prop = propertyDao.displayProperty(conn);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return prop;
	}
	
	
}
