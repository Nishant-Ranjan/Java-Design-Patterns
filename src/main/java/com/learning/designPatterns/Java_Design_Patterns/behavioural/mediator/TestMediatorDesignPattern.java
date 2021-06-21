package com.learning.designPatterns.Java_Design_Patterns.behavioural.mediator;

public class TestMediatorDesignPattern {

	public static void main(String[] args) {
		WatchTower watchTower = new CentralWatchTower();
		Flight f1 = new Flight(1, "F1", watchTower);
		Flight f2 = new Flight(2, "F2", watchTower);
		Flight f3 = new Flight(3, "F3", watchTower);
		watchTower.addFlight(f1);
		watchTower.addFlight(f2);
		watchTower.addFlight(f3);
		

		f1.sendMessage(2, "Hello Flight 2! ! !");
		f2.sendMessage(1, "Hey there! ! !");

		f1.sendMessage(3, "U der?");


	}

}
