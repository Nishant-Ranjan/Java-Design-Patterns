package com.learning.designPatterns.Java_Design_Patterns.behavioural.mediator;

public interface WatchTower {
	
	void addFlight(Flight flight);
	
	void sendMessage(int flightId, String message);

}
