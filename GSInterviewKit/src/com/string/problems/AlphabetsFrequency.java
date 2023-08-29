package com.string.problems;

public class AlphabetsFrequency {
	public static void main(String[] args) {
		String str = "b";
		int[] arr = new int[28];
		
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i)-97]++;
		}
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]!=0)
			{
				char ch = (char)(97 + i);
				System.out.println(ch + " : " + arr[i]);
			}
		}
	}
}
