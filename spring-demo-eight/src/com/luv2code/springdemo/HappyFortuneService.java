package com.luv2code.springdemo;

import org.springframework.stereotype.Component;

@Component("fortuneService")
public class HappyFortuneService implements FortuneService{
	
	@Override
	public String getFortune() {
		return "Have a great day!";
	}

}
