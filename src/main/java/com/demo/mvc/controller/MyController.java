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
//
public class MyController {
	@Autowired 
	private employeeService employeeService;
	
	@RequestMapping(value= {"/","Home","Index"})
	public ModelAndView Index() {
	ModelAndView mv = new ModelAndView();
	//mv.addObject("Employee", "cart");  
	mv.setViewName("cart");
	System.out.println("hello");
	return mv;
	}
	 
	
	@RequestMapping(value="/add",params="addEmp",method=RequestMethod.GET)
	public ModelAndView User(Employee employee,HttpSession session) {
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("Employee", "cart");  
		employeeService.addEmployee(employee);
		//mv.addObject("Employee", employeeService.addEmployee(employee));  
		mv.setViewName("cart");
				  
			return mv; 
		}
	@RequestMapping(value="/add",params="search",method=RequestMethod.GET)
	public ModelAndView search() {
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("Employee", "cart");  
		 
		mv.setViewName("catlog");
		System.out.println("caTLOG");
			  
			return mv;
	
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
	   
	  mv.addObject("salary", "employeeService.ltEmployees(SALARY)"); 
	  mv.setViewName("catlog");
			  
		return mv; }
}
