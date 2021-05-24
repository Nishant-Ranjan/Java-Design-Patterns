package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

import static com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory.ParserType.NY_ERROR_PARSER;
import static com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory.ParserType.TW_ERROR_PARSER;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		AbstractFactory factory = new NYParserFactory();		
		factory.getParserInstance(NY_ERROR_PARSER).parse();
		
		factory = new TWParserFactory();
		factory.getParserInstance(TW_ERROR_PARSER).parse();

	}

}
