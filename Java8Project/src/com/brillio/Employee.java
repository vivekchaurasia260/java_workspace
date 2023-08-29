package com.brillio;

public class Employee {
	
	String name;
	int salary;
	
	
	public Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}


	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}

	
}
