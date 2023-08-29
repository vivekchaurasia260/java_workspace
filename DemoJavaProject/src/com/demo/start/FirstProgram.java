package com.demo.start;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FirstProgram {

	public static void main(String[] args) {
		
//		int[] arr1 = {1,2,3};
//		int[] arr2 = {11,2,3,4};
//		int[] arr3 = {13,4,5,6};
//		int[] arr4 = {7,8,33};
//		
//		
//		for(int i=0; i<arr1.length; i++) {
//			
//			for(int j=0; i<arr2.length; i++) {
//				
//				for(int k=0; i<arr3.length; i++) {
//					
//					for(int l=0; i<arr4.length; i++) {
//						
//						
//					}
//					
//				}
//				
//			}
//			
//		}
		
//		for(int i=0; i<10; i=i++)
//		{
//			i+=1;
//			System.out.println("Hello World");
//		}
		
//		List list = new ArrayList();
//        list.add("hello");
//        list.add(2);
//        System.out.print(list.get(0) instanceof Object);
//        System.out.print(list.get(1) instanceof Integer);

		Map<String,Integer> map = new HashMap<>();
		map.put("guitar", 1200);
		map.put("cello", 3000);
		map.put("drum", 2000);
		
		map.put("cello", 4500);
		
		System.out.println(map.size());
		
		
		
	}

} 
