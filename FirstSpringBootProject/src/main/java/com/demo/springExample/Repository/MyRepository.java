package com.demo.springExample.Repository;

import org.springframework.data.repository.CrudRepository;

import com.demo.springExample.Entity.Student;

public interface MyRepository extends CrudRepository<Student, Integer>{
	
	

}
