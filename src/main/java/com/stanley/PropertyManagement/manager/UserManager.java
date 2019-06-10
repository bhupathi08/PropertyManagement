package com.stanley.PropertyManagement.manager;


import java.sql.SQLException;

import com.stanley.PropertyManagement.domain.User;

public interface UserManager {

	public String addUser(User user) throws SQLException;
	
	public Boolean addUserLogin(User user) throws SQLException;
	
}
