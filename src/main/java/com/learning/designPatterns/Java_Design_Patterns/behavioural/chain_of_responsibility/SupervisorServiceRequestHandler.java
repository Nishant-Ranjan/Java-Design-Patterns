package com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SupervisorServiceRequestHandler implements ServiceRequestInterface {
	private ServiceRequestInterface nextLevel;
	
	{
		nextLevel = new ManagerServiceRequestHandler();
	}
	
	private final static String handlerName = "SUPERVISOR";
	
	@Override
	public String getHandlerName() {
		return handlerName;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		if(request.getRequestLevel().equals(ServiceRequestLevel.SUPERVISOR)) {
			log.info("Service Request handled by Front Desk ! ! !");
		}else {
			log.info("Service Request is transferred to next authority i. e {}", nextLevel.getHandlerName());
			nextLevel.handleRequest(request);
		}

	}

}