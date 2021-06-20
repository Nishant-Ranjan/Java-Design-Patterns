package com.learning.designPatterns.Java_Design_Patterns.behavioural.iterator;


public class EmployeeIterator implements Iterator<Employee> {
	
	private int position;
	private Employee[] employees;

	public EmployeeIterator(Employee[] employees) {
		super();
		this.employees = employees;
		this.position = 0;
	}

	@Override
	public Employee next() {
		if(hasNext())
			return employees[position++];
		throw new RuntimeException("No Next Element Available.");
	}

	@Override
	public Boolean hasNext() {
		if(position >= employees.length)
			return false;
		return true;
	}

	@Override
	public Employee getCurrentElement() {
		return employees[position];
	}

}
