package com.learning.designPatterns.Java_Design_Patterns.behavioural.mediator;


import java.util.HashMap;
import java.util.Map;

import lombok.extern.slf4j.Slf4j;


@Slf4j
public class CentralWatchTower implements WatchTower {
	
	private static Map<Integer, Flight> flights = new HashMap<Integer, Flight>();

	@Override
	public void addFlight(Flight flight) {
		flights.put(flight.getFlightId(), flight);
	}

	@Override
	public void sendMessage(int flightId, String message) {
		Flight flight = flights.get(flightId);
		flight.recieveMessage( message);

	}

}
