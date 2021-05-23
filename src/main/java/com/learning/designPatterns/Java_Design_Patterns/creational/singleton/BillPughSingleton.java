package com.learning.designPatterns.Java_Design_Patterns.creational.singleton;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Nishant_Ranjan
 *When the BillPugh Singleton class is loaded InstanceaHelper static inner class is not loaded
 *It gets loaded when INSTANCE is called
 *This is widely used as it does not require any synchronization
 * 
 * */
@Getter
@Setter
public class BillPughSingleton {
	
	private  String state1;
	private String state2;
	
	private BillPughSingleton() {}
	
	private static class InstanceHelper {
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	
	private static BillPughSingleton getInstance() {
		return InstanceHelper.INSTANCE;
	}

}
