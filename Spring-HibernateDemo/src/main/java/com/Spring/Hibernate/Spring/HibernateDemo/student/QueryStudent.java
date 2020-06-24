package com.Spring.Hibernate.Spring.HibernateDemo.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hbstudent.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		
		// Loading the multiple records and printing it
		/*
		Query query = session.createQuery("from Student s where s.lastName = 'khatri'");
		
		List<Student> theStudent = query.list();
		
		System.out.println(theStudent);
		 */
		
		
		//updating the records using HQL query
		/*
		Query query = session.createQuery("update Student set email='hello@java.com'");
		
		session.beginTransaction();
		
		//Updating the records
		query.executeUpdate();
		
		session.getTransaction().commit();
		
		System.out.println("Updation successful"); 
		*/
		
		session.close();
		factory.close();
	}
	
}
