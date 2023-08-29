package com.array.problems;

import java.util.Map;
import java.util.TreeMap;

public class MergeSortedArray {
	public static void main(String[] args) {
		int arr1[] = { 1, 3, 4, 5, 7}; 
		int arr2[] = {2, 3, 4, 6, 8};
		int N1=arr1.length;
		int N2=arr2.length;
		
		//1st Approach : using extra space
		
		int result[] = new int[N1+N2];
		int i=0;
		int j=0;
		int k=0;
		
		while(i<N1 && j<N2)
		{
			if(arr1[i]<=arr2[j])
			{
				result[k]=arr1[i];
				i++;
			}
			else
			{
				result[k]=arr2[j];
				j++;
			}
			k++;
		}
		
		while(i<N1)
		{
			result[k++]=arr1[i];
			i++;
		}
		while(j<N2)
		{
			result[k++]=arr2[j];
			j++;
		}
		
		for(int x:result)
		{
			System.out.print(x+" ");
		}
		
		
		// 2nd Approach using TreeMap
		
//		Map<Integer, Boolean> map = new TreeMap<>();
//		
//		//Inserting value from array1.
//		
//		for(int i=0; i<N1; i++)
//		{
//			map.put(arr1[i], true);
//		}
//		
//		//Inserting value from array2
//		for(int j=0; j<N2; j++)
//		{
//			map.put(arr2[j], true);
//		}
//		
//		//printing the TreeMap
//		
//		for(Map.Entry<Integer,Boolean> entry : map.entrySet())
//		{
//			System.out.print(entry.getKey()+" ");
//		}
	}
}
