package com.design.abstractFactory;

public class WebDevFactory extends EmployeeAbstractFactory{

	@Override
	public Employee createEmployee() {
		
		return new WebDeveloper();
	}

}
