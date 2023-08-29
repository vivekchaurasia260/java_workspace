package com.math.problems.java;

import java.util.Scanner;

public class ShopDiscount {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int quantity = scan.nextInt();
		double total_amount=quantity*100;
		
		if(total_amount > 1000)
		{
			total_amount = total_amount*(0.1);
		}
		
		System.out.println("Your total price is " +total_amount);
	}
}
