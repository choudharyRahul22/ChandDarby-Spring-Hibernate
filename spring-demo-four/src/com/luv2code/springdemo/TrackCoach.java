package com.luv2code.springdemo;

public class TrackCoach implements Coach {

	FortuneService fortuneService;

	public TrackCoach() {
		// TODO Auto-generated constructor stub
	}

	public FortuneService getFortuneService() {
		return fortuneService;
	}

	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}

	@Override
	public String getDailyWorkout() {
		return "spend 45 minutes on track for running";
	}

	@Override
	public String getDailyFortune() {
		return this.fortuneService.getFortune();
	}

}
