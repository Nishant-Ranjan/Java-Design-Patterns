package com.learning.designPatterns.Java_Design_Patterns.behavioural.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class RemoteController {
	
	private Icommand command;
	
	public void pressButton() {
		command.execute();
	}

}
