package com.java8.list.problems;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicate {
	public static void main(String[] args) {
		
		List<String> list = List.of("aman", "kiran", "aman", "neeraj", "kiran", "Ramesh", "neeraj");
		
		Set<String> set = new HashSet<>();
		
		List<String> duplicateElement = list.stream().filter(ele -> !set.add(ele)).collect(Collectors.toList());
		
		System.out.println(duplicateElement);
	}
}
