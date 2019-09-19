package com.explore.spring.di.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//When we don't provide bean name spring will provide default name which is the name of the class with first letter lowercase
//In this case, it would be cricketCoach
@Component
public class CricketCoach implements Coach {
	
	private FortuneService fortuneService;
	
	//setter based injection using Autowired
	@Autowired
	@Qualifier("happyFortuneService")
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		
		return "Practice 1000 balls per day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
