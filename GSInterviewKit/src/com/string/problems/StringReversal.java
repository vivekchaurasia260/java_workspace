package com.string.problems;

import java.util.Stack;

public class StringReversal {
	public static void main(String[] args) {
		String str="HelloWorld";
		String res="";
		
		//by using for loop
//		for(int i=str.length()-1; i>=0; i--)
//		{
//			res += str.charAt(i);
//		}
//		
//		System.out.println(res);
		
		// by using StringBuilder
		
//		StringBuilder sb = new StringBuilder();
//		sb.append(str);
//		sb.reverse();
//		res = sb.reverse().toString();
//		System.out.println(sb);
		
		// by using ByteArray.
//		byte[] strAsByteArray = str.getBytes();
//		
//		byte[] result = new byte[strAsByteArray.length];
//		
//		// Store the result in reverse order
//		// In Byte Array
//		
//		for(int i=0; i<strAsByteArray.length; i++)
//		{
//			result[i]=strAsByteArray[strAsByteArray.length-i-1];
//		}
//		
//		System.out.println(new String(result));
		
		
		// by using Stack
		
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<str.length(); i++)
		{
			stack.push(str.charAt(i));
		}
		
		String result="";
		
		while(!stack.isEmpty())
		{
			result+=stack.pop();
		}
		
		System.out.println(result);
	}
}
