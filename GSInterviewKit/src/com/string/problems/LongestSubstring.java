package com.string.problems;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {
	public static void main(String[] args) {
		
		//abcabcbb
		
		String str = "abcabcbbabce";
		Set<Character> list = new HashSet<>();
		
		// Using sliding window technique
		int i=0;
		int result=0;
		
		while(i<str.length())
		{
			if(!list.contains(str.charAt(i)))
			{
				list.add(str.charAt(i));
				result = Math.max(result, list.size());
			}
			else
			{
				list.remove(str.charAt(i));
				System.out.println(list);
			}
			
			i++;
		}
		
		//System.out.println(result);
	}
}
