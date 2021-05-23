package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nishant_Ranjan
 *This way of singleton is threadsafe but less efficient as if one of the thread owns the lock of this class
 *any other thread wont be able to execute any method of this class although the second method is non relative to 
 *getInstance method
 */
@Getter
@Setter
public class ThreadSafeSingleton {
	
	private String state1;
	private String state2;
	
	private static ThreadSafeSingleton instance;
	
	private ThreadSafeSingleton() {}
	
	public synchronized ThreadSafeSingleton getInstance() {
		if(instance == null)
			instance = new ThreadSafeSingleton();
		return instance;
	}
	
	
}
