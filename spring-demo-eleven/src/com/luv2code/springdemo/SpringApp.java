package com.luv2code.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.luv2code.springdemo")
@PropertySource("classpath:application.properties")
public class SpringApp {

	/*
	 * Pure Java Configuration with @Bean annotation we removed @Component
	 */

	@Bean
	public static BaseballCoach baseBallCoach() {
		return new BaseballCoach();
	}

	public static void main(String[] args) {

		// load spring configuration file
		AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringApp.class);

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
