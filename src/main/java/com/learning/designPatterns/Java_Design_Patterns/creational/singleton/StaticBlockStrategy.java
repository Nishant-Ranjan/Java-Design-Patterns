package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;
/**
 *This is a type of eager initilazation technique of singleton design pattern.
 *Using this the instance can be created even before it is used which is not practical
 *The only difference is that here we can handle exceptions as well
 */
@Getter
@Setter
public class StaticBlockStrategy {
	
	private String state1;
	private String state2;
	
	private static StaticBlockStrategy instance = null;
	
	private StaticBlockStrategy(){}
	
	static {
		try {
			instance = new StaticBlockStrategy();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public StaticBlockStrategy getInstance() {
		return instance;
	}
	
	

}
