package com.array.problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class FindDuplicateElements {
	public static void main(String[] args) {
		//int[] arr={5,7,3,5,2,7,7,3,5,1,11,34,65};
		//int len=arr.length;
		
		// by using ArrayList and two loops
//		boolean isPresent=false;
//	
//		List<Integer> list = new ArrayList<>();
//		
//		for(int i=0; i<len-1; i++)
//		{
//			for(int j=i+1; j<len; j++)
//			{
//				if(arr[i]==arr[j])
//				{
//					if(list.contains(arr[i]))
//					{
//						break;
//					}
//					else
//					{
//						list.add(arr[i]);
//						isPresent=true;
//					}
//				}
//			}
//		}
//		
//		if(isPresent)
//		{
//			System.out.println(list);
//		}
//		else
//			System.out.println("No elements are duplicate in array");
		
		// By using HashMap
//		Map<Integer, Integer> map = new HashMap<>();
//		
//		for(int i=0; i<len; i++)
//		{
//			int temp = map.getOrDefault(arr[i], 0);
//			map.put(arr[i], ++temp);
//		}
//		
//		System.out.println(map);
//		
//		map.entrySet().stream().filter(entry -> entry.getValue() > 1).forEach(entry -> System.out.println(entry.getKey()));
		
		int[] arr= {1, 2, 3, 1, 3, 6, 6};
		int n=7;
		
		for (int i = 0; i < n; i++)
        {
            int index = arr[i] % n;
            arr[index] += n;
            
           // System.out.print(arr[index]+" ");
        }
		
		for(int x:arr)
		{
			System.out.print(x+" ");
		}
		
		System.out.println();
		
		for (int i = 0; i < n; i++)
        {
            if ((arr[i] / n) >= 2)
                System.out.print(i + " ");
        }
		
	} 
}
