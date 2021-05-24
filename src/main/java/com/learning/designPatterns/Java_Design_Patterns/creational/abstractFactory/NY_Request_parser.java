package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NY_Request_parser implements XmlParser {

	@Override
	public void parse() {
		log.info("This is NY request parser");
	}

}
