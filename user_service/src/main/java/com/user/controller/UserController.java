package com.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.user.entity.User;
import com.user.service.UserService;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/{userId}")
	public User getUser(@PathVariable("userId") long userId) {
				
		User user = this.userService.getUser(userId);
		
		//http://localhost:9092/contact/user/1312
		
		List contacts = this.restTemplate.getForObject("http://contact-service/contact/user/"+ user.getUserId(), List.class);
		
		user.setContacts(contacts);
		
		return user;
	}
}
