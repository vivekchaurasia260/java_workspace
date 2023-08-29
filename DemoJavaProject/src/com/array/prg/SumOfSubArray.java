package com.array.prg;

public class SumOfSubArray {
	public static void main(String[] args) {
		
		int[] arr = {1,2,3};
		int sum=0;
		int ans=0;
		
		/*
		 * Time complexity : O(N^2);
		 * Space complexity : O(1);
		 */
		for(int i=0; i<arr.length; i++) {
			sum=0;
			for(int j=i; j<arr.length; j++) {
				sum+=arr[j];
				ans+=sum;
			}
			System.out.println("Ans " + ans +" sum " +sum);
		}
		
		
	}
}
