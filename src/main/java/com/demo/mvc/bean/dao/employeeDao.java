package com.demo.mvc.bean.dao;

import com.demo.mvc.bean.Employee;

public interface employeeDao {
	public void addEmployee(Employee employee);
	public Employee getEmployee(Integer id);
	public void deleteEmployee(Integer EmployeeID);
	public void ltEmployees(Double salary);
	public void gtEmployees(Double salary);
}
