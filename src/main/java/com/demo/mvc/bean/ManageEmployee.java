package com.demo.mvc.bean;

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

public class ManageEmployee {
	private static SessionFactory sessionFactory;
	public static void main(String[] args) {
		try {
	         //sessionFactory = new Configuration().configure().buildSessionFactory();
			 sessionFactory = new Configuration().configure().addAnnotatedClass(Employee.class).buildSessionFactory();
	      } catch (Throwable ex) { 
	         System.err.println("Failed to create sessionFactory object." + ex);
	         throw new ExceptionInInitializerError(ex); 
	      }
		ManageEmployee me = new ManageEmployee();
	      
	       Integer id1=me.addEmployee(new Employee(2,"mehra","Par",1000));
	      
	     
	      System.out.println(id1);
	      me.ltEmployees();
	      
	}
	public Integer addEmployee(Employee employee) {
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
		return id;
			
		}
	
	public void gtEmployees() {
		Session session=sessionFactory.openSession();
		Criteria cr=session.createCriteria(Employee.class);
		cr.add(Restrictions.gt("SALARY",20000));
		List employees = cr.list();
		Iterator it=employees.iterator();
		while(it.hasNext()) {
			Employee employee=(Employee)it.next();
			System.out.println(employee);
		}
		}
		public void ltEmployees() {
			Session session=sessionFactory.openSession();
			Criteria cr=session.createCriteria(Employee.class);
			cr.add(Restrictions.lt("SALARY",20000));
			List employees = cr.list();
			Iterator it=employees.iterator();
			while(it.hasNext()) {
				Employee employee=(Employee)it.next();
				System.out.println(employee);
			}
		
		
		
		
	}
	
	

}
