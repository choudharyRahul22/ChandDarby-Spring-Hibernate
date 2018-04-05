package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("dailyFortuneService")
public class DailyFortuneService implements FortuneService{
	
	@Override
	public String getFortune() {
		return "Have a great day Daily!";
	}

}
