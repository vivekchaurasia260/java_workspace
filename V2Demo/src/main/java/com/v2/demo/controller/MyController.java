package com.v2.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.v2.demo.entities.Employee;

@RestController
@RequestMapping("/demo")
public class MyController {
	
	@GetMapping("/getEmp/{name}")
	public static ResponseEntity<Employee> getMessage(@Respo("name") String name)
	{
		
		return new ResponseEntity(new Employee(id, name), )
	}
}
