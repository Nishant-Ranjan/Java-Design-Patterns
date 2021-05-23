package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nishant_Ranjan
 *This implements the Lazy Loading strategy for Singleton Design Pattern
 *This is a practical form of implementing Singleton Pattern except this way it isn't threadsafe
 */
@Getter
@Setter
public class LazyLoading {
	
	private String state1;
	private String state2;
	
	private LazyLoading instance;
	
	private LazyLoading() {}
	
	public LazyLoading getInstance() {
			if(instance == null)
				instance = new LazyLoading();
			return instance;
	}

}
