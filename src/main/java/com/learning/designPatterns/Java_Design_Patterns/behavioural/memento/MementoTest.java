package com.learning.designPatterns.Java_Design_Patterns.behavioural.memento;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MementoTest {

	public static void main(String[] args) {
		Article article = new Article(1, "First Article");
		article.setContent("Content");
		
		ArticleMemento articleMemento = article.createMemento();
		
		article.setContent("New Content");
		log.info("Updated Article: {}", article);
		
		article.restoreMemento(articleMemento);
		log.info("Restored Article: {}", article);

	}

}
