package com.learning.designPatterns.Java_Design_Patterns.behavioural.chain_of_responsibility;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Getter
@Setter
@Slf4j
public class FrontDeskServiceRequestHandler implements ServiceRequestInterface {
	
	private ServiceRequestInterface nextLevel;
	
	{
		nextLevel = new SupervisorServiceRequestHandler();
	}
	
	private final static String handlerName = "FRONT_DESK";
	
	@Override
	public String getHandlerName() {
		return handlerName;
	}

	@Override
	public void handleRequest(ServiceRequest request) {
		if(request.getRequestLevel().equals(ServiceRequestLevel.FRONT_DESK)) {
			log.info("Service Request handled by Front Desk ! ! !");
		}else {
			log.info("Service Request is transferred to next authority i. e {}", nextLevel.getHandlerName());
			nextLevel.handleRequest(request);
		}

	}

}
