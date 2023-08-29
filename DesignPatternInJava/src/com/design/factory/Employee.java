package com.design.factory;

/*
 * When there is super class and multiple subclasses and we want
 * to get object of subclasses based on input and requirement.
 * then we create factory class which takes the responsiblity of
 * creating object of class based on input.
 * 
 * Adv : Focus on creating object for interface rather than implementation
 * 
 * loose coupling, more robust code.
 */


public interface Employee {
	
	int salary();
}
