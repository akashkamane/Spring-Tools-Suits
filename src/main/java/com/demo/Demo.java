package com.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.demo.mvc.bean.Employee;

@Controller
public class Demo {
	@RequestMapping("/fetch")
	public ModelAndView m1(@RequestParam int SALARY) {
	Above above=new Above();
	ModelAndView mv = 
	return mv;
	}
	
	@RequestMapping("/add")
	public String User(Employee employee) {
		  
		 employeeService.addEmployee(employee);
		 
		 return "catlog";
		
	
	
	}

}
