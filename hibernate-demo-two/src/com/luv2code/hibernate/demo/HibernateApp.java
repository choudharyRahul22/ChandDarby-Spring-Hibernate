package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class HibernateApp {
	
	/*
	 * Saving to DB
	 * 
	 */
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		
		Student student = new Student(1,"rahul","choudhary","thecrazzyrahul@gmail.com");
		Student student2 = new Student(2,"ravi","choudhary","thecrazzyravi@gmail.com");
		
		try {
			session.beginTransaction();
			session.save(student);
			session.save(student2);
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
		
	}

}
