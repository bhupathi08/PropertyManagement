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
 
import com.stanley.PropertyManagement.conn.*;
import com.stanley.PropertyManagement.domain.*;

import com.stanley.PropertyManagement.manager.PropertyManager;
import com.stanley.PropertyManagement.manager.implementation.*;

@WebServlet(urlPatterns = { "/createProperty" })
public class CreateProperty extends HttpServlet {
	 private static final long serialVersionUID = 1L;
	 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        int id = 1;
        String title = (String) request.getParameter("Title");
        String location = (String) request.getParameter("Location");
        String landmark = (String) request.getParameter("Landmark");
        String area = (String) request.getParameter("Area");
        String price = (String) request.getParameter("Price");
        String image = (String) request.getParameter("image");
        String contactNumber = (String) request.getParameter("ContactNumber");
        
        Property property = new Property(id,title,location,landmark,area,price,image,contactNumber);
        
        String errorString = null;
        
        PropertyManager prop = new PropertyManagerImpl();
    	errorString = prop.addProperty(property);
 
        if (errorString != null) {
            RequestDispatcher dispatcher = request.getServletContext()
                    .getRequestDispatcher("/AddProperty.jsp");
            dispatcher.forward(request, response);
        }
        else {
            response.sendRedirect(request.getContextPath() + "/ViewProperty");
        }
    }
}
