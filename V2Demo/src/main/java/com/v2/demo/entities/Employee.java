package com.v2.demo.entities;

@Entity
@Table(name = "employee")
public class Employee {
	
	@Id
	@Column(name = "emp_id")
	String empId;
	
	@Column(name = "emp_name")
	String empName;
	
}
