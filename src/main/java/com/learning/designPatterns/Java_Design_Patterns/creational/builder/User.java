package com.learning.designPatterns.Java_Design_Patterns.creational.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class User {
	
	private Long userId;
	
	private String name;
	
	private int age;
	
	private String gender;
	
	private String nationality;
	
	
	
	@Override
	public String toString() {
		return String.format("User [userId=%s, name=%s, age=%s, gender=%s, nationality=%s]", userId, name, age, gender,
				nationality);
	}



	static class Builder{
		private Long userId;
		
		private String name;
		
		private int age;
		
		private String gender;
		
		private String nationality;
		
		public Builder userId(Long userId) {
			this.userId = userId;
			return this;
		}
		
		public Builder name(String name) {
			this.name = name;
			return this;
		}
		
		public Builder age(int age) {
			this.age = age;
			return this;
		}
		
		public Builder gender(String gender) {
			this.gender = gender;
			return this;
		}
		
		public Builder nationality(String nationality) {
			this.nationality = nationality;
			return this;
		}
		
		public User build() {
			User user = new User();
			user.userId = this.userId;
			user.name = this.name;
			user.age = this.age;
			user.gender = this.gender;
			user.nationality = this.nationality;
			return user;
		}
		
		
	}
	
}
