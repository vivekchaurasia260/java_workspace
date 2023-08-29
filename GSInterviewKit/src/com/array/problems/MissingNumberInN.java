package com.array.problems;

import java.util.Scanner;

public class MissingNumberInN {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
//		int N = scan.nextInt();
//		
		int[] arr = {6,1,2,8,3,4,7,10,5};
//		
//		// finding the sum of N natural number
//		
//		int sum = N*(N+1)/2;
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			sum -= arr[i];
//		}
//		
//		System.out.println("The missing number is " + sum);
		
		
		// If N is not given then we need to find the max element in the array
		// then we will find the sum of N number with max element in the array.
		
		int N = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++)
		{
			N = Math.max(N, arr[i]);
		}
		
		int sum = N*(N+1)/2;
		
		for(int i=0; i<arr.length; i++)
		{
			sum -= arr[i];
		}
		
		System.out.println("The missing number is " + sum);
	}
}
