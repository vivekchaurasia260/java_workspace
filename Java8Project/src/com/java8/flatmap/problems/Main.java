package com.java8.flatmap.problems;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		
		List<User> users = Arrays.asList(
			new User("Peter", 20, Arrays.asList("1", "2", "5")),
			new User("Sam", 23, Arrays.asList("7", "9", "3")),
			new User("Ryan", 21, Arrays.asList("4", "1", "8")),
			new User("Adam", 32, Arrays.asList("6", "2", "5")),
			new User("Merkel", 17, Arrays.asList("3", "2", "5"))
		);
		
		
		Optional<String> findAny = users.stream()
				.map(user -> user.getPhoneNumber()
				.stream()).flatMap(phoneNumber -> phoneNumber.filter(phone -> phone.equals("3"))).findAny();
		
		
		System.out.println(findAny);
		
		//.flatMap(phoneNumber -> phoneNumber.filter(phone -> phone.equals("5")).collect(Collectors.toList());
		
		
	}
}
