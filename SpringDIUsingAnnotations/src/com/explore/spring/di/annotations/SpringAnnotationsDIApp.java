package com.explore.spring.di.annotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAnnotationsDIApp {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctxt= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
	  Coach tennisCoach=ctxt.getBean("tennisCoach", Coach.class);
	  System.out.println("Tennis Coach: "+tennisCoach.getDailyWorkout());
	  System.out.println("Tennis Coach: "+tennisCoach.getDailyFortune());
		 
		
		Coach cricketCoach=ctxt.getBean("cricketCoach",Coach.class);
		System.out.println("Cricket Coach: "+cricketCoach.getDailyWorkout());
		System.out.println("Cricket Coach Fortune: "+cricketCoach.getDailyFortune());
		
		Coach trackCoach=ctxt.getBean("trackCoach",Coach.class);
		System.out.println("Track Coach: "+trackCoach.getDailyWorkout());
		System.out.println("Track Coach Fortune: "+trackCoach.getDailyFortune());
		
		Coach swimmingCoach=ctxt.getBean("swimmingCoach",Coach.class);
		System.out.println("Swimming Coach: "+swimmingCoach.getDailyWorkout());
		System.out.println("Swimming Coach Fortune: "+swimmingCoach.getDailyFortune());
		
		ctxt.close();

	}

}
