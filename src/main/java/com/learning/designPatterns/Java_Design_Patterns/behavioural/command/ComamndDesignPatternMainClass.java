package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

public class ComamndDesignPatternMainClass {

	public static void main(String[] args) {
		Light bedRoomLight = new Light();
		Light guestRoomLight = new Light();
		
		Fan bedRoomFan = new Fan();
		Fan guestRoomFan = new Fan();
		
		RemoteController remoteController = new RemoteController();
		remoteController.setCommand(new TurnOnLightCommand(bedRoomLight));
		remoteController.pressButton();
		
		remoteController.setCommand(new TurnOnLightCommand(guestRoomLight));
		remoteController.pressButton();
		
		remoteController.setCommand(new TurnOffLightCommand(bedRoomLight));
		remoteController.pressButton();
		
		remoteController.setCommand(new StartFanCommand(guestRoomFan));
		remoteController.pressButton();
		

	}

}
