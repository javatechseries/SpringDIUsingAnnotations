package com.explore.spring.di.annotations;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("trackCoach")
public class TrackCoach implements Coach {
	
	
	private FortuneService fortuneService;
	
	//method based injection using Autowired
	@Autowired
	@Qualifier("happyFortuneService")
	public void doSomething(FortuneService fortuneService) {
		System.out.println("Inside doSomething method");
		this.fortuneService=fortuneService;
	}
	
	@Override
	public String getDailyWorkout() {
		return "Run 5 Miles per day";
	}

	@Override
	public String getDailyFortune() {
			return fortuneService.getFortune();
	}

}
