package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StopFanCommand implements Icommand {
	
	private Fan fan;

	@Override
	public void execute() {
		fan.stop();
	}

}
