package com.explore.spring.di.annotations;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {
	
	private String[] forunes= {"Beaware of sheeps in wolf clothing!","Work hard, you will win!","Today is your lucky day!"};

	Random myRandom=new Random();
	
	@Override
	public String getFortune() {
		
		int index=myRandom.nextInt(forunes.length);
		String fortune=forunes[index];
	
		return fortune;
	}

}
