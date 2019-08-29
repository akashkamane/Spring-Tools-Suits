 	package com.demo.mvc.bean.dao;

import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.demo.mvc.bean.Employee;


public class ManageEmployeeDaoImp implements employeeDao {
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		try {
	         //sessionFactory = new Configuration().configure().buildSessionFactory();
			 sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		ManageEmployeeDaoImp me = new ManageEmployeeDaoImp();
	    me.addEmployee(new Employee(2,"akash","kamane",1000));
	      
	     
	  
	      me.ltEmployees(5000.00);
	      
	}
	
	
	//To Add New Employee
	public void addEmployee(Employee employee) {
		Session session=sessionFactory.openSession();
		Transaction tx=null;
		Integer id=null;
		try {
			tx=session.beginTransaction();
			Serializable s=session.save(employee);
			id=(Integer)s;
			tx.commit();
		}
		catch(HibernateException e)
		{
			if(tx!=null)
				tx.rollback();
			System.out.println(e);
		}
		finally {
			session.close();
		}
		
			
		}
	//To Check the gretter then salary
	public void gtEmployees(Double salary) {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("SALARY",salary));
		List employees = cr.list();
		Iterator it=employees.iterator();
		while(it.hasNext()) {
			Employee employee=(Employee)it.next();
			System.out.println(employee);
		}
		}
	
	//To Check the less then salary
		public void ltEmployees(Double salary) {
			Session session=sessionFactory.openSession();
			Criteria cr=session.createCriteria(Employee.class);
			cr.add(Restrictions.lt("SALARY",salary));
			List employees = cr.list();
			Iterator it=employees.iterator();
			while(it.hasNext()) {
				Employee employee=(Employee)it.next();
				System.out.println(employee);
			}
		
		
		
		
	}
		public void deleteEmployee(Integer EmployeeID) {
			Session session=sessionFactory.openSession();
			Transaction tx=null;
			
			try {
				tx=session.beginTransaction();
				
					Employee employee=(Employee)session.get(Employee.class, EmployeeID);
					System.out.println(employee);
					session.delete(employee);
							
							
				
				tx.commit();
				
			} catch (HibernateException e) {

				if(tx!=null)
					tx.rollback();
				//System.out.println(e);
			}
			finally {
				session.close();
			}
		}
			
			
			
			
			public Employee getEmployee(Integer id) {
				
				Session session=sessionFactory.openSession();
				Transaction tx=null;
				Employee emp=null;
				try {
					tx=session.beginTransaction();
					emp=(Employee)session.get(Employee.class, id);
					System.out.println(emp);
					tx.commit();	
				}
				catch(HibernateException e) {
					if(tx!=null)
						tx.rollback();
					System.out.println(e);
				}
				finally {
					session.close();
				}
				return emp;
			}
		}
