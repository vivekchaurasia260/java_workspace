package com.java8.array.problems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class ArraysProblem {
	public static void main(String[] args) {
		Integer[] arr = {5,7,9,4,0,6,2,1,5,3,6,7,9,1,0,2,9};
		
		Map<Integer, Long> countNumber = Arrays.stream(arr).collect(Collectors.groupingBy(num-> num, Collectors.counting()));
		
		countNumber.entrySet().stream().forEach(entry -> {
			System.out.println(entry.getKey() +"  " + entry.getValue());
		});
		
		String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
		
		//Long collect = Arrays.stream(sentences).map(sen -> sen).
		
	}
}
