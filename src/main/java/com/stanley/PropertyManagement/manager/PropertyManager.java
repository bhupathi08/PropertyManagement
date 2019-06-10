package com.stanley.PropertyManagement.manager;

import java.util.List;

import com.stanley.PropertyManagement.domain.Property;

public interface PropertyManager {
	
	public String addProperty(Property property);
	
	public List<Property> displayProperties();
    
}