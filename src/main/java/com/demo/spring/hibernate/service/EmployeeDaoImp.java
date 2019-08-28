package com.demo.spring.hibernate.service;

import java.io.Serializable;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.mvc.model.Employee;
@Repository
public class EmployeeDaoImp implements employeeDao{

	@Autowired
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		
		  try { sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
		  } catch (Throwable ex) {
		  System.err.println("Failed to create sessionFactory object." + ex); throw new
		  ExceptionInInitializerError(ex); }
		 
	}
	 public void addEmployee(Employee employee) {
		   sessionFactory.getCurrentSession().saveOrUpdate(employee);
		 }
	
	

}
