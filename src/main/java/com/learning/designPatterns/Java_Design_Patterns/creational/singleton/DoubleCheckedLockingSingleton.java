package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;



/**
 * @author Nishant_Ranjan
 *This method is similar to ThreadSafe method except this is more efficient 
 */
@Getter
@Setter
public class DoubleCheckedLockingSingleton {
	
	private String state1;
	private String state2;
	
	private static Object obj1 = new Object();
	private static DoubleCheckedLockingSingleton instance;
	
	private DoubleCheckedLockingSingleton() {}
	
	public static DoubleCheckedLockingSingleton getInstance() {
		synchronized (obj1) {
			if(instance== null)
				instance = new DoubleCheckedLockingSingleton();
		}
		return instance;
	}
	
	
}
