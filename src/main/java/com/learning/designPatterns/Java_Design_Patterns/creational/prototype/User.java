package com.learning.designPatterns.Java_Design_Patterns.creational.prototype;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class User {
	
	private long userId;
	private String name;
	private String email;
	private AccessControl accessControl;
}
