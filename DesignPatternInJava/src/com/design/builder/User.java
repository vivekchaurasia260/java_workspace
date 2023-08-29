package com.design.builder;

/*
 * Builder pattern is used to create immutable objects mostly.
 */
public class User {
	
	private final String userId;
	private final String userName;
	private final String email;
	private final String address;
	
	private User(UserBuilder builder) {
		//Initialize
		this.userId = builder.userId;
		this.userName = builder.userName;
		this.email = builder.email;
		this.address = builder.address;
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName + ", email=" + email + ", address=" + address + "]";
	}	
	
	// inner class to create object

	static class UserBuilder {
		
		private String userId;
		private String userName;
		private String email;
		private String address;
		
		public UserBuilder() {
			
		}
		
		public UserBuilder setUserId(String userId) {
			this.userId = userId;
			return this;
		}
		
		public UserBuilder setUserName(String userName) {
			this.userName = userName;
			return this;
		}
		
		public UserBuilder setEmail(String email) {
			this.email = email;
			return this;
		}
		
		public UserBuilder setAddress(String address) {
			this.address = address;
			return this; 
		}
		
		public User build() {
			User user = new User(this);
			
			return user;
		}
	}
}
