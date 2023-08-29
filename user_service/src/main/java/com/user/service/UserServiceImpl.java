package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.Contact;
import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	List<User> list = List.of(
			new User(1311L, "Ankit Tiwari", "76346545234"),
			new User(1312L, "Neeraj Pandey", "9272566541"),
			new User(1313L, "Rakesh Singh", "5272534233"),
			new User(1314L, "Pankaj Yadav", "2616634534")
			);

	@Override
	public User getUser(long userId) {
		
		return list.stream().filter(user -> user.getUserId()==userId).findAny().orElse(null);
	}

}
