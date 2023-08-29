package com.java8.list.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class TwoListFiltering {
	public static void main(String[] args) {
		
		// creating two list
		
		List<String> list1 = List.of("Singh", "Swati", "Ramesh", "Chanchal", "Raghav", "Pushpa");
		List<String> list2 = List.of("Neha", "Vidya", "Pushpa", "Santosh", "Swati", "Mangesh", "Singh");
		
		Set<String> set = new HashSet<>();
		
		List<String> duplicateValues = list1.stream().filter(ele -> list2.contains(ele)).collect(Collectors.toList());
		
		System.out.println(duplicateValues);
	}
}
