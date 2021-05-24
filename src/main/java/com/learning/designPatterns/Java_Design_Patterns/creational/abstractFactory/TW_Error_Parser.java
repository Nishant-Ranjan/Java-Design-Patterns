package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TW_Error_Parser implements XmlParser {

	@Override
	public void parse() {
		log.info("This is TW Error parser");
	}

}
