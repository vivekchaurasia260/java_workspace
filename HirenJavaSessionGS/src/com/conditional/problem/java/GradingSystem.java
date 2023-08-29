package com.conditional.problem.java;

import java.util.Scanner;

public class GradingSystem {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter marks of student : ");
		int marks = scan.nextInt();
		String grade = "";
		
		if(marks>80)
		{
			grade="A";
		}
		else if(marks>60 && marks<=80)
		{
			grade="B";
		}
		else if(marks>50 && marks<=60)
		{
			grade="C";
		}
		else if(marks>45 && marks<=50)
		{
			grade="D";
		}
		else if(marks>25 && marks<=45)
		{
			grade="E";
		}
		else
		{
			grade="F";
		}
		
		System.out.println("Student Grade is " + grade);
		
	}
}
