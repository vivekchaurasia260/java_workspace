package com.multithreading.program;

public class ImplementingStartMethod extends Thread {
	
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			//System.out.println("Child Thread");
		}
		Thread.currentThread().setPriority(8);
		
		System.out.println(Thread.currentThread().getPriority());
	}
	
//	public void start()
//	{
//		super.start();
//		System.out.println("Start Method");
//	}
	
	public static void main(String[] args) {
		
		ImplementingStartMethod tmp = new ImplementingStartMethod();
		tmp.start();

		for(int i=0; i<5; i++)
		{
			//System.out.println("Main Thread");
		}
		//tmp.start();
		System.out.println(Thread.currentThread().getName());
	}
}
