package com.demo.start;

public class DemoPrg {
	
	public static void main(String[] args) {
		
		int[] arr = {5,2,4,1,3};
		int k=3;
		
		for(int i=0; i<arr.length; i++) {
			
			int temp = arr[(i+k)%arr.length];
			arr[(i+k)%arr.length] = arr[i];
			arr[i]=arr[(i+k)%arr.length];
		}
		
		print(arr);
	}
	
	public static void print(int[] arr) {
		
		for(int x : arr)
			System.out.print(x+" ");
		
		System.out.println();
	}
	
	
}
