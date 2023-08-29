package com.test.logic;

public class Test1 {
	public static void main(String[] args) {
		int[] arr = {5,3,7,22,8,64,4};
		int largest = Integer.MIN_VALUE;
		int second = 0;
		int third = 0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i] > largest)
			{
				third = second;
				second = largest;
				largest = arr[i];
			}
			else if(arr[i]<largest && arr[i]>second)
			{
				third = second;
				second = arr[i];
			}
			else if(arr[i]<second && arr[i]>third)
			{
				third = arr[i];
			}
		}
		
		System.out.println(largest + " " + second + " " + third);
	}
}
