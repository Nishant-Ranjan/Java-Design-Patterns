package com.learning.designPatterns.Java_Design_Patterns.behavioural.mediator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@AllArgsConstructor
@Getter
@Setter
@Slf4j
public class Flight {
	
	private int flightId;
	private String flightName;
	private WatchTower tower;
	
	
	public void sendMessage(int flightId, String message) {
		log.info("{} sending message: {}", this.flightName, message);
		tower.sendMessage(flightId, message);
	}
	
	public void recieveMessage(String message) {
		log.info("{} recieved message: {}", flightName, message);
	}
		

}
