package com.demo.mvc.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.demo.mvc.bean.Employee;
import com.demo.mvc.service.employeeService;


@RestController

public class MyController {
	@Autowired 
	private employeeService employeeService;
	
	@RequestMapping("/")
	public String m1() {
		
	System.out.println("hello");
	return "cart";
	}
	 
	
	@RequestMapping(value="/add",params="addEmp",method=RequestMethod.POST)
	public ModelAndView User(Employee employee,HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		employeeService.addEmployee(employee);
		
		mv.addObject(employee);  
		mv.setViewName("cart");
				  
			return mv; 
		}
	@RequestMapping(value="/add",params="search",method=RequestMethod.POST)
	public String search() {
		
	System.out.println("hello");
	return "catlog";
	}
	@RequestMapping(value="/search",params="Abovebutton",method=RequestMethod.POST)
	  public ModelAndView Above(@RequestParam Double SALARY) {	  
	  ModelAndView mv = new ModelAndView();
	  //Fetch above=new Fetch();
	  employeeService.gtEmployees(SALARY);
	  mv.addObject(SALARY);  
	  mv.setViewName("catlog");
			  
		return mv; }
	
	@RequestMapping(value="/add",params="Belowbutton",method=RequestMethod.POST)
	  public ModelAndView Below(@RequestParam Double SALARY) {	  
	  ModelAndView mv = new ModelAndView();
	  //Fetch above=new Fetch(); 
	  employeeService.ltEmployees(SALARY);	  
	  mv.addObject(SALARY);  
	  mv.setViewName("catlog");
			  
		return mv; }
}
