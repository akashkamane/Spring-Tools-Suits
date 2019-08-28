package com.demo.mvc.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;
@Component
@Entity
@Table(appliesTo="HEmployee")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="first_name")
	 private String firstName; 
	@Column(name="Email")
	   private String Email; 
	@Column(name="Salary")
	   private int salary;
	public Employee() {
		super();
	
	}
	
	public Employee(int id, String firstName, String email, int salary) {
		super();
		this.id = id;
		this.firstName = firstName;
		Email = email;
		this.salary = salary;
	}
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", Email=" + Email + ", salary=" + salary + "]";
	}
	   

}
