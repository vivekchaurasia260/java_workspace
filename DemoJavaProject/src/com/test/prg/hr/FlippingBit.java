package com.test.prg.hr;

public class FlippingBit {
	public static void main(String[] args) {
		long num=9;		
		//int a = (int) ~num;

		//int res = (int) (~num);
		//System.out.println("Res " +res);
		int res =-10;
        String c = Integer.toBinaryString(res);
        System.out.println("c " +c);
        System.out.println(Long.parseLong(c,2));
        
        
	}
}
