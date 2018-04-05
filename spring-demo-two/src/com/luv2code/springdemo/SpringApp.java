package com.luv2code.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringApp {
	
	public static void main(String[] args) {
		
		/* 
		 * Spring Application Inversion of control & dependency injection
		 */
		
		 // load spring configuration file
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
				
		
		// load bean from spring container
		Coach theCoach = applicationContext.getBean("trackCoach", TrackCoach.class);
		
		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());
		
		// close the context
		applicationContext.close();
	}

}
