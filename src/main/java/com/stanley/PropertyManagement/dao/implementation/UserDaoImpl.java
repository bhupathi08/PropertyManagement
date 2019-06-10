package com.stanley.PropertyManagement.dao.implementation;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.stanley.PropertyManagement.dao.UserDao;
import com.stanley.PropertyManagement.domain.User;

public class UserDaoImpl implements  UserDao{

	
		public void insertUser(Connection conn, User user) throws SQLException {
			String sql = "Insert into User(first_name, last_name, email, username, password) values(?,?,?,?,?)";
			PreparedStatement p = conn.prepareStatement(sql);

			p.setString(1, user.getFirstName());
			p.setString(2, user.getLastName());
			p.setString(3, user.getEmail());
			p.setString(4, user.getUsername());
			p.setString(5, user.getPassword());

			p.executeUpdate();
		}

		public  Boolean validateLogin(Connection conn, User user) throws SQLException {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery("Select * from User where username='" + user.getUsername() + "'and password='"
					+ user.getPassword() + "'");
			if (rs.next()) {
				return true;
			} else {
				return false;
			}
		}
		
	}


