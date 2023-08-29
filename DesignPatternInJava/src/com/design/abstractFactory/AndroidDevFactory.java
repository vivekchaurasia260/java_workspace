package com.design.abstractFactory;

import com.design.factory.AndroidDeveloper;

public class AndroidDevFactory extends EmployeeAbstractFactory {

	@Override
	public Employee createEmployee() {
		
		return new Android();
	}

}
