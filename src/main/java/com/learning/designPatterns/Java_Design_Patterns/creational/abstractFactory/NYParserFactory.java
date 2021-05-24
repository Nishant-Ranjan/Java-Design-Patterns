package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

public class NYParserFactory implements AbstractFactory {
	
	@Override
	public XmlParser getParserInstance(ParserType parserType) {
		XmlParser parser ;
		switch(parserType) {
			case NY_ERROR_PARSER : return new NY_Error_Parser();
			case NY_FEEDBACK_PARSER: return new NY_Feedback_parser();
			case NY_REQUEST_PARSER: return new NY_Request_parser();
		}
		throw new RuntimeException("Mentioned parser not found ! ! !");
	}

}
