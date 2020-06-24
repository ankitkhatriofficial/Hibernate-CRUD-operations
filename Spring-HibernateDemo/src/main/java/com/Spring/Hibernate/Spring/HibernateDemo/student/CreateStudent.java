package com.Spring.Hibernate.Spring.HibernateDemo.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateStudent {

	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration()
									.configure("hbstudent.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		
		System.out.println("Creating new Student Object");
		Student theStudent4 = new Student("Niara", "fez", "fail@industry.com"); 
		
		System.out.println("Initiating The Transaction");
		session.beginTransaction();
		
		System.out.println("Saving the Object into the Session");
		session.save(theStudent4);
		
		session.getTransaction().commit();
		System.out.println("Object is Successfully saved");
		
		session.close();
		factory.close();
	}
	
}
