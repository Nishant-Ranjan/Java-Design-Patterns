package com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility;

import static com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility.ServiceRequestLevel.DIRECTOR;

public class ServiceRequestMainClass {

	public static void main(String[] args) {
		ServiceRequest serviceRequest = new ServiceRequest(ServiceRequestLevel.MANAGER);
		
		ServiceRequestInterface requestInterface = new FrontDeskServiceRequestHandler();
		requestInterface.handleRequest(serviceRequest);

	}

}
