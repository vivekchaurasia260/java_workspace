package com.math.problems.java;

import java.util.Scanner;

public class CheckSquare {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int length = scan.nextInt();
		int breadth = scan.nextInt();
		
		System.out.println(length == breadth ? "It is a square" : "It is not a square");
	}
}
