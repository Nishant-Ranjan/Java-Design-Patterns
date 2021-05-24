package com.learning.designPatterns.Java_Design_Patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FeedbackParser implements XmlParser {

	@Override
	public void parse() {
		log.info("Feedback xml has been parsed");
	}

}
