package com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility;

public interface ServiceRequestInterface {
	void handleRequest(ServiceRequest request);
	String getHandlerName();
}
