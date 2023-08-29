package com.java8.topics.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaExpression {
	public static void main(String[] args) {
		
		// Check the number is even or not by using lambda exp.
		Predicate<Integer> pred = num -> num%2==0;
		
		System.out.println(pred.test(5));
		
		// Return the square of a number by using lambda exp.
		Function<Integer, Integer> square = num1 -> num1*num1;
		
		System.out.println(square.apply(7));
		
		
		//Iner jdg =  -> { System.out.println("Hello"); }
		
		List<Integer> res = new ArrayList<>(); //List.of(5,3,54,2,7,2,87,32,66,65,87,22,12);
		res.add(4);
		res.add(67);
		res.add(3);
		res.add(7);
		res.add(71);
		res.add(98);
		res.add(8);
		res.add(42);
		System.out.println(res);
		
		Comparator<Integer> c = (i1,i2) -> (i1<i2) ? -1 : (i1>i2) ? 1 : 0;
		
		Collections.sort(res, (i1, i2) -> i1<i2 ? 1 : i1>i2 ? -1 : 0);
		
		// 
		System.out.println(res);
		
	
		
	}

}
