package com.luv2code.hibernate.demo;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class HibernateApp {

	/*
	 * Update objects
	 * 
	 */

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Student.class)
				.buildSessionFactory();
		Student student;
		Session session = factory.getCurrentSession();
		try {
			session.beginTransaction();
			int id = 8;
			student = session.get(Student.class, id);
			student.setFirstName("bhalu");
			session.getTransaction().commit();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			factory.close();
		}

	}

}
