package com.learning.designPatterns.Java_Design_Patterns.creational.factory;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class DisplayEntry {
	
	public void displayXml() {
		XmlParser parser = getXmlParser();
		parser.parse();
	}

	protected abstract XmlParser getXmlParser();

}
