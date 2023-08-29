package com.design.builder;

public class Main {
	public static void main(String[] args) {
		
		User user1 = new User.UserBuilder()
				.setEmail("sirius@gmail.com")
				.setUserId("123")
				.setUserName("Sirius")
				.setAddress("Askaban")
				.build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder()
				.setEmail("pandey.neeraj33@outlook.com")
				.setAddress("Varanasi").setUserId("124")
				.setUserName("Neeraj")
				.build();
		
		System.out.println(user2);
		
		
	}
}
