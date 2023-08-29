package com.brillio;

import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		Employee emp1 = new Employee("Vivek", 1000);
		Employee emp2 = new Employee("Neeraj", 10000);
		Employee emp3 = new Employee("Pankaj", 500);
		Employee emp4 = new Employee("Swati", 5000);
		Employee emp5 = new Employee("Rashmi", 7000);
		
		List<Employee> list = List.of(emp1, emp2, emp3, emp4, emp5);
		
		
		// Stream : Salary more than 5000;
		
		list.stream().filter(emp -> emp.salary > 5000).forEach(System.out::println);
		
		// sink : It is streaming tech.
		
		// consumer 
		
	}
}
