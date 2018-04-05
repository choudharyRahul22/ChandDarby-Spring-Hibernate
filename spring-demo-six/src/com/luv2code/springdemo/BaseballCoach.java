package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	private FortuneService fortuneService;

	private String email;

	private String company;

	private String name;

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

}
