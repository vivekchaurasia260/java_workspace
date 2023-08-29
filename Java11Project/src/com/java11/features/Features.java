package com.java11.features;

import java.util.List;
import java.util.stream.Collectors;

public class Features {
	public static void main(String[] args) {
		
		/*	List of all features introduced in java 11
		 * 
		 * 	1. New String Methods : 
		 * 		
		 * 		isBlank();
		 * 
		 * 		lines()
		 * 
		 * 		repeat(int args)
		 * 		
		 * 		stripLeading() : Remove space from the front of the string.
		 * 		stripTrailing() : Remove space from the end of the string.
		 * 		strip() : Remove space from both front and end.
		 * 
		 *  2. New File Methods : 
		 *  	
		 *  	writeString()
		 *  	readString()
		 *  	isSameFile()
		 * 		
		 * 	3. Pattern Recognizing Method
		 * 		
		 * 		asMatchPredicate()
		 *  
		 *  4. Epsilon Garbage Collector
		 *  
		 * 
		 */ 
		
		// 1 String Methods :
		
		String str1 = "";
		System.out.println(str1.isBlank());
		
		String str2 = "Hello World";
		System.out.println(str2.isBlank());
		
		
		String str3 = "This\nis\nthe\nreference taken from GFG";
		List<String> linesMethod = str3.lines().collect(Collectors.toList());		
		System.out.println(linesMethod);
		 

		String str4 = "Sirius";
		String repeatString = str4.repeat(5);
		System.out.println(repeatString);
		
		
		String str5 = " My name is ";
		//System.out.println(str5.stripLeading());
		//System.out.println(str5.stripTrailing());
		System.out.println(str5.strip());
		
		
		// 2 
		
		
		
		
	}
}
