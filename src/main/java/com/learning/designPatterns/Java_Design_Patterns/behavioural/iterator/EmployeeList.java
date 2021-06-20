package com.learning.designPatterns.Java_Design_Patterns.behavioural.iterator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class EmployeeList {
	
	private Employee[] employees;
	
	public Iterator<Employee> iterator(){
		return new EmployeeIterator(employees);
	}

}
