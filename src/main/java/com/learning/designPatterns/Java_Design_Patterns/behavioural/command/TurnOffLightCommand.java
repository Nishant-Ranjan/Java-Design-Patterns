package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class TurnOffLightCommand implements Icommand {
	
	private Light light;

	@Override
	public void execute() {
		light.turnOff();

	}

}
