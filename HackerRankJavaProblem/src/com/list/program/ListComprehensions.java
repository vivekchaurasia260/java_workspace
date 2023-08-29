package com.list.program;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

// This problem is from Hacker rank Python problems.
public class ListComprehensions {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		int z = scan.nextInt();
		int n = scan.nextInt();
		
		List<Integer> temp = new ArrayList<>();
		List<List<Integer>> result = new ArrayList<>();
		
		for(int i=0; i<=x; i++)
		{
			for(int j=0; j<=y; j++)
			{
				for(int k=0; k<=z; k++)
				{
					//List<Integer> temp = new ArrayList<>();
					
					if((i+j+k) != n)
					{
						temp.add(i);
						temp.add(j);
						temp.add(k);
						//Collections.copy(temp, result);
						System.out.println(temp);
						//result.add(temp.);
					}
					temp.clear();
				}
			}
		}
		
		System.out.println(result);
	}

}
