package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

public interface AbstractFactory {
	
	public XmlParser getParserInstance(ParserType parserType);

}
