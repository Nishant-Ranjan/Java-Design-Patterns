package com.learning.designPatterns.Java_Design_Patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RequestParser implements XmlParser {

	@Override
	public void parse() {
		log.info("Request xml has been parsed.");
	}

}
