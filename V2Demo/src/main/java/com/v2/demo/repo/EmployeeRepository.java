package com.v2.demo.repo;

import org.springframework.stereotype.Repository;

import com.v2.demo.entities.Employee;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, String> {
	
	 
}
