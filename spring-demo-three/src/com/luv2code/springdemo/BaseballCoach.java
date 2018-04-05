package com.luv2code.springdemo;

public class BaseballCoach implements Coach {

	FortuneService fortuneService;

	public BaseballCoach() {
		// TODO Auto-generated constructor stub
	}

	public BaseballCoach(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
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
