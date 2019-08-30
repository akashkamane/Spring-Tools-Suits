package com.demo.mvc.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.mvc.bean.Employee;
import com.demo.mvc.bean.dao.employeeDao;



@Service
//@Transactional

public class EmployeeServiceImp implements employeeService {
	@Autowired
	public employeeDao employeeDao;
		
	//@Transactional
	 public void addEmployee(Employee employee) {
	  employeeDao.addEmployee(employee);
	 }

	@Transactional
	public Employee getEmployee(Integer EmployeeID) {
		Employee emp=employeeDao.getEmployee(EmployeeID);
		return emp;
	}

	@Transactional
	public void deleteEmployee(Integer EmployeeID) {
		employeeDao.deleteEmployee(EmployeeID);
		
	}

	@Transactional
	public void ltEmployees(Double salary) {
		employeeDao.ltEmployees(salary);
		
	}

	@Transactional
	public void gtEmployees(Double salary) {
		employeeDao.gtEmployees(salary);
		
	}
	


}
