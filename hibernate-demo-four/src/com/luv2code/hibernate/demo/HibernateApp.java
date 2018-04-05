package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class HibernateApp {
	
	/*
	 * Read from DB
	 * 
	 */
	
	public static void main(String[] args) {
		
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class).buildSessionFactory();
		
		Session session = factory.getCurrentSession();
		Student student = new Student("shalu","choudhary","thecrazzyshalu@gmail.com");
		try {
			session.beginTransaction();
			session.save(student);
			session.getTransaction().commit();
			System.out.println("Student saved with primary key : " + student.getId());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		List<Student> students;
		try {
			session = factory.getCurrentSession();
			session.beginTransaction();
			//students = (List<Student>) session.createQuery("from Student").getResultList();
			students = (List<Student>) session.createQuery("from Student where firstName='rahul'").getResultList();
			session.getTransaction().commit();
			System.out.println("All Students : " + students);
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			factory.close();
		}
		
	}

}
