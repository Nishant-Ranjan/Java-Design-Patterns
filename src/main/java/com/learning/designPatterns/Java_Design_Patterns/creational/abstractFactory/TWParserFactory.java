package com.learning.designPatterns.Java_Design_Patterns.creational.abstractFactory;

public class TWParserFactory implements AbstractFactory {

	@Override
	public XmlParser getParserInstance(ParserType parserType) {
		XmlParser parser ;
		switch(parserType) {
		case TW_ERROR_PARSER : return new TW_Error_Parser();
		case TW_FEEDBACKPARSER: return new TW_Feedback_parser();
		case TW_REQUEST_PARSER: return new TW_Request_parser();
		}
		throw new RuntimeException("Mentioned TW parser not found ! ! !");
	}
}