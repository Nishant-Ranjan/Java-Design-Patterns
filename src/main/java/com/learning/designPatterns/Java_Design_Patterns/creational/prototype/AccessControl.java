package com.learning.designPatterns.Java_Design_Patterns.creational.prototype;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AccessControl implements Prototype {
	
	private String role;
	
	private String authority;
	
	

	@Override
	public AccessControl clone() throws CloneNotSupportedException {
		try {
			return (AccessControl) super.clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return null;
	}



	public AccessControl(String role, String authority) {
		super();
		this.role = role;
		this.authority = authority;
	}

}
