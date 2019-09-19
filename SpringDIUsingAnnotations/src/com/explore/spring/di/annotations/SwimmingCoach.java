package com.explore.spring.di.annotations;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;


//When we don't provide bean name spring will provide default name which is the name of the class with first letter lowercase
//In this case, it would be cricketCoach
@Component
public class SwimmingCoach implements Coach {
	
	
	//Field based injection using Autowired
	@Autowired
	@Qualifier("happyFortuneService")
	private FortuneService fortuneService;
	
	
	@Override
	public String getDailyWorkout() {
		
		return "Swim 400 yards every day";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

}
