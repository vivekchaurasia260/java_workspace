package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService {
	
	// fake list of contact..
	List<Contact> list = List.of(
			new Contact(1L, "vivekchaurasia331@gmail.com", "Vivek Chaurasia", 1311L),
			new Contact(2L, "singh.ram221@gmail.com", "Ram Singh", 1311L),
			new Contact(3L, "vinodpatel112@gmail.com", "Vinod Patel", 1311L),
			new Contact(1L, "kartiknarayan77@gmail.com", "Kartik Aryan", 1312L),
			new Contact(1L, "raj.santosh111@gmail.com", "Santosh Raj", 1313L),
			new Contact(1L, "singhkiran881@gmail.com", "Kiran Singh", 1312L),
			new Contact(1L, "pushpasharma99@gmail.com", "Pushpa Sharma", 1313L),
			new Contact(1L, "rajanr7701@gmail.com", "Rajiv Ranjan", 1314L)
			);

	@Override
	public List<Contact> getContactsOfUser(Long userId) {
		
		return list.stream().filter(contact -> contact.getUserId()==userId).collect(Collectors.toList());
	}

}
