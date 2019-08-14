package com.example.demo;

import org.springframework.stereotype.Component;

@Component("Item")
public class Item {
	private int id;
	private String name;
	private String imagepath;
	private String description;
	private double price;
	
	public Item() {
		super();
		System.out.println("Inside Laptop");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getImagepath() {
		return imagepath;
	}
	public void setImagepath(String imagepath) {
		this.imagepath = imagepath;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", imagepath=" + imagepath + ", description=" + description
				+ ", price=" + price + "]";
	}
	
	

}
