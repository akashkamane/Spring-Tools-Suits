package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component

public class User {
	
	private int Id;
	private String Name;
	private String Sirname;
	private String UserName;
	private String Address;
	@Autowired
	@Qualifier("Item")
	private Item item;
	
	public User() {
		super();
		System.out.println("Inside User");
	}
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSirname() {
		return Sirname;
	}
	public void setSirname(String sirname) {
		Sirname = sirname;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", Name=" + Name + ", Sirname=" + Sirname + ", UserName=" + UserName + ", Address="
				+ Address + "]";
	}
	
	

}
