package com.getter_setter.practice.java;

public class BankAccount {
	private String customerAccountNumber;
	private double customerBalance;
	private String customerName;
	private String customerEmailAddress;
	private String customerPhoneNumber;
	
	public BankAccount()
	{
		System.out.println("Empty constructor called.");
	}
	
	
	
	public BankAccount(String customerAccountNumber, double customerBalance, String customerName,
			String customerEmailAddress, String customerPhoneNumber)
	{
		System.out.println("Bank Account with parameter is called ");
		this.customerAccountNumber = customerAccountNumber;
		this.customerBalance = customerBalance;
		this.customerName = customerName;
		this.customerEmailAddress = customerEmailAddress;
		this.customerPhoneNumber = customerPhoneNumber;
	}



	public String getCustomerAccountNumber()
	{
		return customerAccountNumber;
	}

	public void setCustomerAccountNumber(String customerAccountNumber)
	{
		this.customerAccountNumber = customerAccountNumber;
	}

	public double getCustomerBalance()
	{
		return customerBalance;
	}

	public void setCustomerBalance(double customerBalance) {
		this.customerBalance = customerBalance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerEmailAddress() {
		return customerEmailAddress;
	}

	public void setCustomerEmailAddress(String customerEmailAddress) {
		this.customerEmailAddress = customerEmailAddress;
	}

	public String getCustomerPhoneNumber() {
		return customerPhoneNumber;
	}

	public void setCustomerPhoneNumber(String customerPhoneNumber) {
		this.customerPhoneNumber = customerPhoneNumber;
	}

	public void deposit(double depositAmount)
	{
		if(depositAmount > 0)
		{
			this.customerBalance += depositAmount;
			System.out.println("Deposit of " + depositAmount + " made. New Balance is " + this.customerBalance);
		}
	}
	
	public void withdraw(double withdrawalAmount)
	{
		if((this.customerBalance - withdrawalAmount) < 0)
		{
			System.out.println("Only " + this.customerBalance + " available. Withdrawal not processed");
		}
		else
		{
			this.customerBalance -= withdrawalAmount;
			System.out.println("Withdrawal of " + withdrawalAmount + " processed. Remaining balance = " + this.customerBalance);
		}
	}
}	
