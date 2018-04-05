package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	/* 
	 * Spring Application with Annotation
	 */
	
	public static void main(String[] args) {
		
		 // load spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		// load bean from spring container
		Coach theCoach = applicationContext.getBean("baseBallCoach", BaseballCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		System.out.println(theCoach.getDailyFortune());
		
		// create object
		BaseballCoach baseBallCoach = applicationContext.getBean("baseBallCoach", BaseballCoach.class);
		
		System.out.println(baseBallCoach.getEmail() + " : " + baseBallCoach.getCompany());
		System.out.println(baseBallCoach.getName() + " : " + baseBallCoach.getContact());
		
		// close the context
		applicationContext.close();
	}

}
