package com.design.factory;

public class DeveloperClient {
	public static void main(String[] args) {
		
		Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		System.out.println(employee.salary());
	}
}
