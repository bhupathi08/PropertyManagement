package com.stanley.PropertyManagement.model;

public class Property {
   
   public Property() {
		super();
	}
private int id;
   private String title;
   private String location;
   private String landmark;
   private String area;
   private String price;
   
   public Property(int id, String title, String location, String landmark, String area, String price) {
		super();
		this.id = id;
		this.title = title;
		this.location = location;
		this.landmark = landmark;
		this.area = area;
		this.price = price;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getLandmark() {
		return landmark;
	}
	public void setLandmark(String landmark) {
		this.landmark = landmark;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
}
