package com.getter_setter.practice.java;

public class Main {
	public static void main(String[] args) {
		
		BankAccount bobsAccount = new BankAccount("3635633", 0.00, "Bob Martin", "martin.bob@yahoo.com", "(+84) 448-2353521");
		
//		bobsAccount.setCustomerAccountNumber("3635633");
//		bobsAccount.setCustomerBalance(0.00);
//		bobsAccount.setCustomerName("Bob Martin");
//		bobsAccount.setCustomerEmailAddress("martin.bob@yahoo.com");
//		bobsAccount.setCustomerPhoneNumber("(+84) 448-2353521");
		
		/*
		 * You can see we need to set each and every field one by one by using setter method.
		 * to overcome this we should initialize the fields by using constructor.
		 */
		
		bobsAccount.withdraw(100.0);
		
		bobsAccount.deposit(50.0);
		bobsAccount.withdraw(100.0);
		
		
	}
}
