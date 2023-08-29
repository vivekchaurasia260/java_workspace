package com.java8.problems;

public class Employee {
	
	private int emp_id;
	private String name;
	private String email;
	private int salary;
	private String dept;
	
	public Employee()
	{
		
	}

	public Employee(int emp_id, String name, String email, int salary, String dept) {
		this.emp_id = emp_id;
		this.name = name;
		this.email = email;
		this.salary = salary;
		this.dept = dept;
	}

	public int getEmp_id() {
		return emp_id;
	}

	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public String getDept()
	{
		return dept;
	}
	
	public void setDept(String dept)
	{
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", email=" + email + ", salary=" + salary + ", dept="
				+ dept + "]";
	}

	
	
}
