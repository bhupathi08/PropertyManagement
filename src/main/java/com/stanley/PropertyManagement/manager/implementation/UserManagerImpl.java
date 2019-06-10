package com.stanley.PropertyManagement.manager.implementation;

import com.stanley.PropertyManagement.conn.ConnectionUtils;
import com.stanley.PropertyManagement.dao.PropertyDao;
import com.stanley.PropertyManagement.dao.UserDao;
import com.stanley.PropertyManagement.dao.implementation.PropertyDaoImpl;
import com.stanley.PropertyManagement.dao.implementation.UserDaoImpl;
import com.stanley.PropertyManagement.domain.Property;
import com.stanley.PropertyManagement.domain.User;
import com.stanley.PropertyManagement.manager.UserManager;

import java.sql.Connection;
import java.sql.SQLException;

public class UserManagerImpl implements UserManager {

	public String addUser(User user) {
		
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
	             UserDao userDao = new UserDaoImpl();
	             userDao.insertUser(conn, user);
	         } catch (SQLException e) {
	             e.printStackTrace();
	             errorString = e.getMessage();
	         }
	     }
	
	     return errorString;
	
}
	
	public Boolean addUserLogin(User user) {
		
		Connection conn = null;
		try {
			conn = ConnectionUtils.getMySQLConnection();
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		
		
		String errorString = null;
		Boolean isValid = false;
		if (errorString == null) {
	         try {
	             UserDao userDao = new UserDaoImpl();
	            isValid = userDao.validateLogin(conn, user);
	         } catch (SQLException e) {
	             e.printStackTrace();
	             errorString = e.getMessage();
	         }
	     }
	
	     return isValid;
	
}
		
	}
	
	

