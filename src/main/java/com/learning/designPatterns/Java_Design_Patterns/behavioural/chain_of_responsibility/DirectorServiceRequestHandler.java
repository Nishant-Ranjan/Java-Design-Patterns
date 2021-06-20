package com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DirectorServiceRequestHandler implements ServiceRequestInterface {

	private ServiceRequestInterface nextLevel;
	
	private final static String handlerName = "DIRECTOR";
	
	@Override
	public String getHandlerName() {
		return handlerName;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		if(request.getRequestLevel().equals(ServiceRequestLevel.DIRECTOR)) {
			log.info("Service Request handled by Director ! ! !");
		}else {
			log.info("Your Service Request doesnt fall under this department");
		}

	}

}
