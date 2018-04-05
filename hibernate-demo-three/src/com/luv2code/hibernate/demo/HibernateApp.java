package com.luv2code.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class HibernateApp {
	
	/*
	 * Primary Key & we can have custom id generator & alter table and change auto increment value like 100 so next id will be 101
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
