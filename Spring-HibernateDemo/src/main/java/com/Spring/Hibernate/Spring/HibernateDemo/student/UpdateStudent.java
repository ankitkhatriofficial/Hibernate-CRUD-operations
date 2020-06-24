package com.Spring.Hibernate.Spring.HibernateDemo.student;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UpdateStudent {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration()
									.configure("hbstudent.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		
		// We have to update the student first name where student id = 6
		int id = 6;
		
		Student theStudent = session.load(Student.class, 6);
		
		session.beginTransaction();
		
		//Updating First Name
		theStudent.setFirstName("BOOM");
		
		session.getTransaction().commit();
		
		System.out.println("Updated Successfully");
		
		session.close();
		factory.close();
	}

}
