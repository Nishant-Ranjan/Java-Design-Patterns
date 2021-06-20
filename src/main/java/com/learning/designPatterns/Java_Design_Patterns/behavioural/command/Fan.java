package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Fan {
	
	public void start() {
		log.info("Fan started ! ! !");
	}
	
	public void stop() {
		log.info("Fan stopped! ! !");
	}

}
