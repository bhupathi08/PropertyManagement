package com.stanley.PropertyManagement.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanley.PropertyManagement.conn.ConnectionUtils;
import com.stanley.PropertyManagement.domain.User;
import com.stanley.PropertyManagement.manager.UserManager;
import com.stanley.PropertyManagement.manager.implementation.UserManagerImpl;

@WebServlet(urlPatterns = { "/LoginServlet" })
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public LoginServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	 
	      	      
	        String userName = (String) request.getParameter("userName");
	        String password = (String) request.getParameter("password");

	        User user = new User(userName, password);
	 
	        String errorString = null;
	        Boolean result = false;
	        
	        UserManager us = new UserManagerImpl();
	        try {
				result = us.addUserLogin(user);
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
	        
	        if (result && errorString == null){
	            response.sendRedirect(request.getContextPath() + "/Home.jsp");
	        } else {
	        	response.sendRedirect(request.getContextPath() + "/Login.jsp");
	        }
	    }
	}


