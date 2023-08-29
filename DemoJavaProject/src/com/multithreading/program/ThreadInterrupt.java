package com.multithreading.program;

public class ThreadInterrupt implements Runnable {
	
	@Override
	public void run() {
		try {
			for(int i=0; i<10; i++)
			{
				System.out.println("I am a Lazy thread");
				Thread.sleep(2000);
			}
		}
		catch(InterruptedException ite)
		{
			System.out.println("Got Interrupted!!");
		}	
	}
	
	public static void main(String[] args) {
		
		ThreadInterrupt ti = new ThreadInterrupt();
		Thread t = new Thread(ti);
		t.start();
		t.interrupt();
		System.out.println("End of main Thread");
		
	}
}
