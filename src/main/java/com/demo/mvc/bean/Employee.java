package com.demo.mvc.bean;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.Entity;
import org.hibernate.annotations.Table;
import org.springframework.stereotype.Component;

@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Column(name="first_name")
	 private String firstName; 
	@Column(name="Email")
	   private String Email; 
	@Column(name="SALARY")
	   private double SALARY;
	public Employee() {
		super();
	
	}
	
	public Employee(int id, String firstName, String email, double SALARY) {
		super();
		this.id = id;
		this.firstName = firstName;
		Email = email;
		this.SALARY = SALARY;
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
	public double getSALARY() {
		return SALARY;
	}
	public void setSALARY(double SALARY) {
		this.SALARY = SALARY;
	}
	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", Email=" + Email + ", salary=" + SALARY + "]";
	}
	   

}
