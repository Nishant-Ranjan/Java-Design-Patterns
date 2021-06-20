package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {
	
	public void turnOn() {
		log.info("Light turned on ! ! !");
	}
	
	public void turnOff() {
		log.info("Light turned off ! ! !");
	}

}
