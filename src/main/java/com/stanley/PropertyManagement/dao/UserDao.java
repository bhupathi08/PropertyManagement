package com.stanley.PropertyManagement.dao;

import java.sql.Connection;
import java.sql.SQLException;


import com.stanley.PropertyManagement.domain.User;

public interface UserDao {

	public void insertUser(Connection conn, User user) throws SQLException;
	public  Boolean validateLogin(Connection conn, User user) throws SQLException;
	
}
