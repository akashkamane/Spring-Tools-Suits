package com.demo.spring.hibernate.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mvc.hibernate.service.employeeService;
import com.demo.mvc.model.Employee;

@Service
@Transactional

public class EmployeeServiceImp implements employeeService {
	@Autowired
	private employeeDao employeeDao;
		
	@Transactional
	 public void addEmployee(Employee employee) {
	  employeeDao.addEmployee(employee);
	 }
	


}
