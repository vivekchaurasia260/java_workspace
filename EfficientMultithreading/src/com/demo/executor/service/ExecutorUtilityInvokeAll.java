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
 * invokeAll() - It receives the data from all callable objects ( return list of future objects).
 * 
 */

class MyService2 implements Callable<String> {
	int i = 0;
	
	public MyService2(int i)
	{
		this.i = i;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(1000);
		System.out.println("In thread " + i);
		return "from thread " + i;
	}
	
}


public class ExecutorUtilityInvokeAll {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		
		List<Callable<String>> callableList = new ArrayList<>();
		
		for(int i=0; i<10; i++)
		{
			callableList.add(new MyService2(i));	
		}
		
		List<Future<String>> futureList = es.invokeAll(callableList);
		
		es.shutdown(); // won't wait for thread execution.
		es.awaitTermination(10, TimeUnit.SECONDS); // wait till here
		
		System.out.println("==================================================");
		
		for(Future<String> future : futureList)
		{
			System.out.println(future.get());
		}
		
		System.out.println(new Date());
	}
}
