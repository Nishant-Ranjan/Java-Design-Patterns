package com.learning.designPatterns.Java_Design_Patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ErrorParser implements XmlParser{
	@Override
	public void parse() {
		log.info("Error XML has been parsed.");
	}

}
