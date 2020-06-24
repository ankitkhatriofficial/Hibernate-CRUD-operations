package com.Spring.Hibernate.Spring.HibernateDemo.student;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class DeleteStudent {

	public static void main(String[] args) {

		/*
		 *  There are two ways for deleting the records In Database
		 *  1) Load the single record or multiple records(list) and use session.delete()
		 *  2) Delete the records directly using HQL Query
		 */
		
		SessionFactory factory = new Configuration()
									.configure("hbstudent.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
		
		Session session = factory.openSession();
		
		//First way of deleting records (using single record)
		/*
		int id = 9;
		
		Student theStudent = session.load(Student.class, id);
		
		session.beginTransaction();
		
		session.delete(theStudent);
	
		session.getTransaction().commit();
		
		System.out.println("Student with id: "+id+ " has been deleted");
		
		*/
		
		
		//First way of deleting records (using multiple records)
		/*
		Query query = session.createQuery("from Student s where s.id IN(13,14,15)");
		
		List<Student> list = query.list();
		
		System.out.println("Students list are :\n" +list);
		
		session.beginTransaction();
		
		for(Student theStudent : list)
			session.delete(theStudent);
		
		session.getTransaction().commit();
		
		System.out.println("Students with given ids have been deleted");
		
		*/
		
		
		//Second way of deleting the records
		/*
		Query query = session.createQuery("delete from Student where id IN(11,12)");
		
		session.beginTransaction();
		
		query.executeUpdate();
		
		session.getTransaction().commit();
		
		System.out.println("Students with given id are deleted");
		*/
		
		
		session.close();
		factory.close();
	}

}
