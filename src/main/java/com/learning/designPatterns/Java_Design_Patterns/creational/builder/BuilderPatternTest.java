package com.learning.designPatterns.Java_Design_Patterns.creational.builder;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BuilderPatternTest {

	public static void main(String[] args) {
		User user = new User.Builder().userId(1L)
				.age(23)
				.gender("Male")
				.name("Nishant")
				.nationality("Indian").build();
		
		log.info(user.toString());
	}

}
