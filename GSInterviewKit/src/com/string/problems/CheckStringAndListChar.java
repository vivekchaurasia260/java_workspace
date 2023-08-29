package com.string.problems;

import java.util.List;

public class CheckStringAndListChar {
	public static void main(String[] args) {
		String str="I like Mango";
		List<String> element = List.of("I", "like", "Mango");
		
		boolean result = isEqual(str, element);
		System.out.println(result);
	}
	
	public static boolean isEqual(String str, List<String> list)
	{
		
		String[] words = str.split(" ");
		
		System.out.println(words.length);
		
		if(list.size() >= words.length)
		{			
			for(int i=0; i<words.length; i++)
			{
				if(!list.contains(words[i]))
				{
					return false;
				}
			}
			
			return true;
		}
		
		return false;
	}
}
