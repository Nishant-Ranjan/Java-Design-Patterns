package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 *This is eager initilazation technique of singleton design pattern.
 *Using this the instance can be created even before it is used which is not practical
 *
 */

@Getter
@Setter
public class SingletonDesignPatternEagerInitialization {
	private String state1;
	private String state2;
	
	private static SingletonDesignPatternEagerInitialization instance = new SingletonDesignPatternEagerInitialization();
	
	private SingletonDesignPatternEagerInitialization() {}
	
	public static SingletonDesignPatternEagerInitialization getInstance() {
		return instance;
	}
	 
	
	
}
