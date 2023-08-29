package com.list.program;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TestLogic1 {
	public static void main(String[] args) {
		
		List<List<Integer>> finalRes = new ArrayList<>();
		
		List<Integer> list1 = new ArrayList<>();
		list1.add(45);
		list1.add(35);
		list1.add(65);
		list1.add(5);
//		list1.add(77);
//		list1.add(44);
//		list1.add(97);
//		list1.add(42);
//		list1.add(74);
//		list1.add(16);
		
		System.out.println(list1);
		List<Integer> list2 = new ArrayList<>();
		
		Collections.copy(list2, list1);
		
		System.out.println("List 2 : " + list2);
//		finalRes.add(list1);
//		list1.clear();
//		System.out.println("Final List " + finalRes);
//		//finalRes.add(list2);
//		
		System.out.println(finalRes);
		
	}
}
