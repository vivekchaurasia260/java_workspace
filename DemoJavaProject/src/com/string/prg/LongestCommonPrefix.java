package com.string.prg;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int size = scan.nextInt();
		String[] arr = new String[size];
		
		for(int i=0; i<size; i++)
		{
			arr[i]=scan.next();
		}
		
		String result = longestCommonPrefix(arr);
		System.out.println(result);
	}
	public static String longestCommonPrefix(String[] arr)
	{
		String prefix=arr[0];
		
		for(int i=1; i<arr.length; i++)
		{
			String str=arr[i];
			
			// indexOf() -> the index of the first occurrence of the specified substring,or -1 if there is no such occurrence.
			while(arr[i].indexOf(prefix) != 0)
			{
				prefix = prefix.substring(0, prefix.length()-1);
				System.out.println("Prefix " +prefix);
				
				if(prefix.isEmpty())
					return "";
			}
			System.out.println("Exit from the while loop");
		
		}
		
		return prefix;
	}
}
