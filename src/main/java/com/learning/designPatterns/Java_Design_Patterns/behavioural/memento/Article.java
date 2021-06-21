package com.learning.designPatterns.Java_Design_Patterns.behavioural.memento;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Article {
	private String title;
	private int id;
	private String content;
	
	Article(int id, String title){
		this.id = id;
		this.title = title;
	}
	
	public ArticleMemento createMemento(){
		return new ArticleMemento(title, id, content);
	}
	
	public void restoreMemento(ArticleMemento articleMemento) {
		this.title = articleMemento.getTitle();
		this.id = articleMemento.getId();
		this.content = articleMemento.getContent();
	}

}
