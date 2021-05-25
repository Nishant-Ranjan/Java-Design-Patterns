package com.learning.designPatterns.Java_Design_Patterns.creational.prototype;

public interface Prototype extends Cloneable {
	
	public AccessControl clone() throws CloneNotSupportedException;

}
