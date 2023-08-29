package com.collections.hashmap.program.java;

import java.util.HashMap;
import java.util.Map;

public class HashMapImplementation {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		
		// Inserting elements into hashmap
		map.put(1, "Rohan");
		map.put(2, "Neeraj");
		map.put(3, "Frodo");
		map.put(4, "Sauron");
		map.put(5, "Gandalv");
		
		//printing hashmap
		System.out.println(map);
		
		
		// printing value of hashmap at specfied key
		
		System.out.println(map.get(3));
	}
}
