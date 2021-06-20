package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOnLightCommand implements Icommand {
	
	private Light light;	

	@Override
	public void execute() {
		light.turnOn();		
	}

}
