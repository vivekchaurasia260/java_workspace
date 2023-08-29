package com.multithreading.program;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=0; i<5; i++)
		{
			System.out.println("Good morning");
			try
			{
				Thread.sleep(2000);
			}
			catch(InterruptedException ite)
			{
				System.out.println("Got Interrupted!!");
			}
			System.out.println(name);
		}
	}
}

class MyThread extends Thread
{
	Display d;
	String name;
	
	MyThread(Display d, String name)
	{
		this.d=d;
		this.name=name;
	}
	
	public void run()
	{
		d.wish(name);
	}
}

public class SynchronizationModifier {
	public static void main(String[] args) {
		Display d = new Display();
		MyThread t1 = new MyThread(d, "Sirius");
		MyThread t2 = new MyThread(d, "Vivek");
		t1.start();
		t2.start();
	}
}

