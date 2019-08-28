package com.demo.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.demo.mvc.hibernate.service.employeeService;
import com.demo.mvc.model.Employee;

@Controller

public class MyController {
	/*
	 * @Autowired private employeeService employeeService;
	 */
	 
	
	
	
	@RequestMapping("/")
	public String m1() {
		
	System.out.println("hello");
	return "cart";
	
	
	}
//	@RequestMapping("/add")
//	public String User(Employee employee) {
//		  
//		 employeeService.addEmployee(employee);
//		 
//		 return "catlog";
//		
//		  
//		  }
	
	public String m4(Employee employee) {
	System.out.println("hello");
	return "catlog";
	}
	
	
	
	@RequestMapping("/search")
	public String m2() {
	System.out.println("hello");
	return "catlog";
	}
	

}
