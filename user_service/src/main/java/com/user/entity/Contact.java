package com.user.entity;

public class Contact {
	
	private long cid;
	private String email;
	private String contactName;
	private long userId;
	
	public Contact() {
		
	}

	public Contact(long cid, String email, String contactName, long userId) {
		super();
		this.cid = cid;
		this.email = email;
		this.contactName = contactName;
		this.userId = userId;
	}

	public long getCid() {
		return cid;
	}

	public void setCid(long cid) {
		this.cid = cid;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContactName() {
		return contactName;
	}

	public void setContactName(String contactName) {
		this.contactName = contactName;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}
}
