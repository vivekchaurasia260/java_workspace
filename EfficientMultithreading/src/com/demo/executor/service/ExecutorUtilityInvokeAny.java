package com.demo.executor.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/*
 * ExecutorService
 * execute()
 * shutDown() 
 * awaitTermination() - It will wait for specified amount of time.
 * 
 * Future - stores data received by submit()
 * 
 * submit(new Runnable()) -- returns null 
 * submit(new Callable()) -- returns data
 * invokeAny() - It invokes all the callables and returns the data from any of the callables.
 * invokeAll()
 * 
 */

class MyService1 implements Callable<String> {
	int i = 0;
	
	public MyService1(int i)
	{
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		//Thread.sleep(1000);
		System.out.println("In thread " + i);
		return "from thread " + i;
	}
	
}


public class ExecutorUtilityInvokeAny {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		
		List<Callable<String>> callableList = new ArrayList<>();
		callableList.add(new MyService1(1));
		callableList.add(new MyService1(2));
		callableList.add(new MyService1(3));
		callableList.add(new MyService1(4));
		callableList.add(new MyService1(5));
		
		String str = es.invokeAny(callableList);	// Invoke anyone thread.
		
		es.shutdown(); // won't wait for thread execution.
		es.awaitTermination(10, TimeUnit.SECONDS); // wait till here
		
		System.out.println("==================================================");
		
		System.out.println(str);
		
		System.out.println(new Date());
	}
}
