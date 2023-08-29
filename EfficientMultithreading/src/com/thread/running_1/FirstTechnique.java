package com.thread.running_1;

import java.util.concurrent.TimeUnit;

public class FirstTechnique {
	public static void main(String[] args) {
		new FirstTask();
		
		System.out.println("Main Thread ends here....");
	}
}

class FirstTask extends Thread {
	
	@Override
	public void run()
	{
		for(int i=10; i>0; i--)
		{
			System.out.println("Tick Tick " + i);
			
			try {
				TimeUnit.MILLISECONDS.sleep(250);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public FirstTask()
	{
		this.start();
	}
}

