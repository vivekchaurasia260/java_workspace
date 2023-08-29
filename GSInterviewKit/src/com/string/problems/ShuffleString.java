package com.string.problems;

public class ShuffleString {
	public static void main(String[] args) {
		
		// This belongs to leetcode problem - 1528
		String[] str = {"ksfg", "sgsg fsg"};
		
		StringBuilder sb = new StringBuilder();
		
		System.out.println(sb.toString());
		
		String join = String.join("?", str);
		
		System.out.println(join);
		
	}
}
