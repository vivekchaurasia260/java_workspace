package com.array.problem.java;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ReverseArray {
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
		
		// printing the original array
		System.out.println("Original Array is ");
		printArr(arr);
		
		// Reversing the array - Ist approach
		int j=0;
		
		while(j < len/2)
		{
			int temp = arr[j];
			arr[j] = arr[len-1-j];
			arr[len-1-j] = temp;
			
			j++;
		}
		
		// IInd approach
		
//		Arrays.sort(arr, Collections.reverseOrder());
		
		// printing the reverse of array
		System.out.println("Reverse of array is ");
		printArr(arr);
	}
	
	public static void printArr(int[] arr)
	{
		for(int x : arr)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
	}
}
