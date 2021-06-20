package com.learning.designPatterns.Java_Design_Patterns.behavioural.iterator;

public interface Iterator<T> {
	T next();
	Boolean hasNext();
	T getCurrentElement();

}
