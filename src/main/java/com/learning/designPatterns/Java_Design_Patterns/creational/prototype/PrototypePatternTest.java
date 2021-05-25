package com.learning.designPatterns.Java_Design_Patterns.creational.prototype;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PrototypePatternTest {

	public static void main(String[] args) {
		
		AccessControl userAccessControl = AccessControlProvider.getAccessControlInstance("User");
		User user1 = new User(1L, "Nishant", "test@gmail.com", userAccessControl);
		User user2 = new User(2L, "Rishi", "Test1@gmail.com", AccessControlProvider.getAccessControlInstance("User"));
		
		log.info("User 1: "+user1);
		log.info("User 2: "+user2);
	}

}
