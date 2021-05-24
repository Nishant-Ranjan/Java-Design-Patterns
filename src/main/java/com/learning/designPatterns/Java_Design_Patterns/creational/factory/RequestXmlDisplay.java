package com.learning.designPatterns.Java_Design_Patterns.creational.factory;

public class RequestXmlDisplay extends DisplayEntry {

	@Override
	protected XmlParser getXmlParser() {
		return new RequestParser();
	}

}
