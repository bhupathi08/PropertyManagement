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
import com.stanley.PropertyManagement.domain.Property;
import com.stanley.PropertyManagement.domain.User;
import com.stanley.PropertyManagement.manager.PropertyManager;
import com.stanley.PropertyManagement.manager.UserManager;
import com.stanley.PropertyManagement.manager.implementation.PropertyManagerImpl;
import com.stanley.PropertyManagement.manager.implementation.UserManagerImpl;

@WebServlet(urlPatterns = { "/createUser" })
public class CreateUser extends HttpServlet {
	
	 private static final long serialVersionUID = 1L;
	 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        int id = 1;
        String firstName = (String) request.getParameter("firstName");
        String lastName = (String) request.getParameter("lastName");
        String email = (String) request.getParameter("email");
        String userName = (String) request.getParameter("userName");
        String password = (String) request.getParameter("password");

        User user = new User(firstName,lastName,email,userName,password);
 
        String errorString = null;
       
        UserManager us = new UserManagerImpl();
    	
			try {
				errorString = us.addUser(user);
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/Registration.jsp");
            dispatcher.forward(request, response);
        }
        else {
            response.sendRedirect(request.getContextPath() + "/Login.jsp");
        }
    }
}
