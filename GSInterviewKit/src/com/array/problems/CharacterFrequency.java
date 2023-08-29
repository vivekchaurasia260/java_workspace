package com.array.problems;

import java.util.HashMap;
import java.util.Map;

public class CharacterFrequency {
	public static void main(String[] args) {
		String str = "abcfabcbbaf";
		
		// By using map
//		Map<Character, Integer> freqCount = new HashMap<>();
//		
//		for(int i=0; i<str.length(); i++)
//		{
//			int temp = freqCount.getOrDefault(str.charAt(i), 0);
//			freqCount.put(str.charAt(i), ++temp);
//		}
		
		//freqCount.entrySet().stream().forEach(entry -> System.out.println(entry.getKey() + " " + entry.getValue()));
		
		// Printing by Method reference
//		freqCount.entrySet().stream().forEach(System.out::println);
		
		// By using array
		
		int[] arr = new int[256];
		
		for(int i=0; i<str.length(); i++)
		{
			arr[(int)str.charAt(i)]++;
		}
		
		// Printing frequency of character
		
		for(int i=0; i<256; i++)
		{
			if(arr[i]!=0)
			{
				System.out.println((char)i + " " + arr[i]);
			}
		}
	}
}
