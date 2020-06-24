package com.Spring.Hibernate.Spring.HibernateDemo.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
									.configure("hbstudent.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		
		Student theStudent = (Student) session.load(Student.class, 7);
		
		System.out.println(theStudent.getFirstName());
		
		session.close();
		factory.close();
	}

}
