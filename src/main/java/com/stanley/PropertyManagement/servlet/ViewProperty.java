package com.stanley.PropertyManagement.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.stanley.PropertyManagement.conn.ConnectionUtils;
import com.stanley.PropertyManagement.domain.Property;
import com.stanley.PropertyManagement.manager.PropertyManager;
import com.stanley.PropertyManagement.manager.implementation.PropertyManagerImpl;

@WebServlet(urlPatterns = { "/ViewProperty" })
public class ViewProperty extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		List<Property> properties = new ArrayList<Property>();

		PropertyManager prop = new PropertyManagerImpl();
		properties = prop.displayProperties();
		request.setAttribute("properties", properties);

		request.getRequestDispatcher("/ViewProperties.jsp").forward(request, response);
//            response.sendRedirect(request.getContextPath() + "/ViewProperties.jsp");

	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

	}

}
