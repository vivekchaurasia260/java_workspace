package com.array.problem.java;

import java.util.Arrays;
import java.util.Scanner;

public class SmallestElement {
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
		
		// smallest number in an array is : Ist approach
//		Arrays.sort(arr);
//		System.out.println(arr[0]);
		
		// IInd approach
		int smallest = Integer.MAX_VALUE;
		for(int i=0; i<len; i++)
		{
			if(smallest>arr[i])
			{
				smallest=arr[i];
			}
		}
		
		System.out.println("Smallest number is " +smallest);
		
		
		
	}
}