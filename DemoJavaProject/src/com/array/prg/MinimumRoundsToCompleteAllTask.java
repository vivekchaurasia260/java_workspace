package com.array.prg;

import java.util.HashMap;
import java.util.Map;

public class MinimumRoundsToCompleteAllTask {
	public static void main(String[] args) {
		int[] tasks = {2,2,3,3,2,4,4,4,4,4,2,2,2,2,5,5,5,6,6,6,6,6,6,6,6};
		//int[] tasks = {7,7,7,7,7,7};
		int result = minimumRounds(tasks);		
		System.out.println(result);
	}
	
	public static int minimumRounds(int[] tasks)
	{
		// 1st approach : By using HashMap
		
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0; i<tasks.length; i++)
		{
			int temp=map.getOrDefault(tasks[i], 0);
			map.put(tasks[i], ++temp);
		}
		for(int count : map.values())
		{
				
		}
		
		System.out.println(map);
		/*
		int count=0;
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet())
		{
			if(entry.getValue()<2)
				return -1;
			else
			{
				System.out.println(entry.getValue() +" " + entry.getValue()/3 + " " + count);
				
				if(entry.getValue()<3)
					count++;
				else if(entry.getValue()%3 == 0)
				{	
					count = count + (entry.getValue()/3);
					System.out.println("Inside Else-if");
				}	
				else
					count = count + (entry.getValue()/3)+1;
				System.out.println(count);
			}				
		}
		*/
		
		// 2nd approach : By using array
		int count=0;
		
		for(int i=0; i<tasks.length-1; i++)
		{
			count=1;
			for(int j=i+1; j<tasks.length; j++)
			{
				if(tasks[i]==tasks[j] && tasks[j]!=0)
				{
					count++;
					tasks[j]=0;
				}
			}
			System.out.println(count);
		}
		
		return 1;
	}
}
