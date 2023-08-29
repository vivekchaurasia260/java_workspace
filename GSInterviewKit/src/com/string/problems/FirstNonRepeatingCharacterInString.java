package com.string.problems;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collectors;

public class FirstNonRepeatingCharacterInString {
	public static void main(String[] args) {
		String [] strArr = {"apple","aappllee","aabbcde","kettle"};
		
		//find first non-repeating character in a array of String
		
		Map<Character, Integer> wordFreq = new LinkedHashMap<Character, Integer>();
		List<Character> res = new ArrayList<>();
		
		for(int i=0; i<strArr.length; i++)
		{
			String word=strArr[i];
						
			for(int j=0; j<word.length(); j++)
			{
				int temp = wordFreq.getOrDefault(word.charAt(j), 0);
				wordFreq.put(word.charAt(j), ++temp);
			}
						
			Optional<Entry<Character, Integer>> result = wordFreq.entrySet().stream().filter(entry -> entry.getValue() == 1).findFirst();
			
			if(result.isPresent())
			{
				res.add(result.get().getKey());
			}
			else
				res.add('0');
			
			wordFreq.clear();
		}
		
		System.out.println("The First non-repeating character in every word of array are " + res);
				
		
		//find non-repeating character in a String
		
		String str = "ababazbbababcaabfbfbfbfbbfsbdbdgbdbgbd";

		Map<Character, Integer> map = new LinkedHashMap<>();
		
		for(int i=0; i<str.length(); i++)
		{
			int temp = map.getOrDefault(str.charAt(i), 0);
			map.put(str.charAt(i), ++temp);
		}
		
		System.out.println(map);
		
		Optional<Entry<Character, Integer>> findFirst = map.entrySet().stream().filter(entry-> entry.getValue()==1).findFirst();
		
		System.out.println(findFirst.get().getKey());
	}
}
