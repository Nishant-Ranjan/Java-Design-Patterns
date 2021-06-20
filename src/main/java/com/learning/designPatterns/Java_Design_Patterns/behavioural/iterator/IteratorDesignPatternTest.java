package com.learning.designPatterns.Java_Design_Patterns.behavioural.iterator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class IteratorDesignPatternTest {

	public static void main(String[] args) {
		Employee[] employees = new Employee[2];
		employees[0] = new Employee(1, "Abc");
		employees[1] = new Employee(2, "XYZ");
		
		
		EmployeeList empList = new EmployeeList(employees);
		
		Iterator<Employee> iterator = empList.iterator();
		while(iterator.hasNext()) {
			Employee emp = iterator.next();
			log.info(emp.toString());
		}
	}

}
