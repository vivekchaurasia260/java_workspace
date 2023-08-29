package com.array.problems;

import java.util.Set;
import java.util.TreeSet;

public class SecondLargestNumber {
	public static void main(String[] args) {
		int[] arr = {8,8,5,3};
		int firstLargest=0;
		int secondLargest=0;
		int thirdLargest=0;
		// here we are using the same array to find the largest and second largest
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>firstLargest)
			{
				thirdLargest=secondLargest;
				secondLargest=firstLargest;
				firstLargest=arr[i];
			}
			else if(arr[i]>secondLargest && arr[i]!=firstLargest)
			{
				thirdLargest=secondLargest;
				secondLargest=arr[i];
			}
			else if(arr[i]>thirdLargest && arr[i]!=secondLargest)
			{
				thirdLargest=arr[i];
			}
		}
		
		System.out.println(firstLargest + " " +secondLargest + " " +thirdLargest);
		
		// Approach 2: By using TreeSet 
		
//		Set<Integer> set = new TreeSet<>();
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			set.add(arr[i]);
//		}
//		
//		System.out.println(set);
	}
}
