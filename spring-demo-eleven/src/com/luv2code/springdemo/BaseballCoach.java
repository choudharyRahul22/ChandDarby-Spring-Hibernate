package com.luv2code.springdemo;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;


public class BaseballCoach implements Coach{

	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;

	@Value("thecrazzyrahul@gmail.com")
	private String email;

	@Value("Optum Global Solutions")
	private String company;

	@Value("${name}")
	private String name;

	@Value("${contact}")
	private String contact;

	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	@Override
	public String getDailyWorkout() {
		return "spend daily 30 min on batting";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}
	
	@PostConstruct
	public void customInit() {
		System.out.println("Custom Init method initialize");
		//this.setName("choudhary");
	}
	
	@PreDestroy
	public void customDestroy() {
		System.out.println("Custom Destroy method destruction");
	}

}
