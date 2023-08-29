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
 * invokeAny()
 * invokeAll()
 * 
 */

class MyService implements Callable<String> {
	int i = 0;
	
	public MyService(int i)
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


public class ExecutorUtilityCallable {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService es = Executors.newFixedThreadPool(2);
		System.out.println(new Date());
		
		List<Future<String>> futureList = new ArrayList<>();
		for(int i=0; i<10; i++)
		{
			futureList.add((Future<String>) es.submit(new MyService(i)));
		}
		
		es.shutdown(); // won't wait for thread execution.
		es.awaitTermination(10, TimeUnit.SECONDS); // wait till here
		
		System.out.println("==================================================");
		for(Future<String> future: futureList)
		{
			// We will get null for callable because in Runnable it is not returning anything(void).
			System.out.println(future.get()); // null in case of runnable.
		}
		
		System.out.println(new Date());
	}
}
