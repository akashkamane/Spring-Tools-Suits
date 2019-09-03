package com.demo.mvc.service;

import com.demo.mvc.bean.Employee;

public interface employeeService {

	public void addEmployee(Employee employee);
	public Employee getEmployee(Integer id);
	public void deleteEmployee(Integer EmployeeID);
	public void ltEmployees(Double salary);
	public void gtEmployees(Double salary);

}
