package com.array.problem.java;

import java.util.Scanner;

public class SecondSmallestElement {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter Size of an array ");		
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		// Inserting element into array.
		for(int i=0; i<len; i++)
		{
			arr[i] = scan.nextInt();
		}
		
		// finding the second smallest element
		int smallest = Integer.MAX_VALUE;
		int second_smallest = smallest;
		
		for(int i=0; i<len; i++)
		{
			if(smallest > arr[i])
			{
				second_smallest=smallest;
				smallest=arr[i];
			}
			else if(arr[i]!=smallest && second_smallest > arr[i])
			{
				second_smallest = arr[i];
			}
		}
		
		System.out.println("First Smallest number is " + smallest);
		System.out.println("Second Smallest number is " + second_smallest);
		
	}
}
