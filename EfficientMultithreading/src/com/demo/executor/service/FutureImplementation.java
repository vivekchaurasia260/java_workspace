package com.demo.executor.service;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

class MyCallable implements Callable<String> {

	@Override
	public String call() throws Exception {
	
		return "Task executed in Callable";
	}	
}

public class FutureImplementation {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService es = Executors.newSingleThreadExecutor();	
		// Future Impl
		// Future<String> futureObj = es.submit(new MyCallable());
		// System.out.println(futureObj.get());
		
		// FutureTask Impl
		FutureTask<String> futureTask = new FutureTask<String>(new MyCallable());
		es.submit(futureTask);
		
		System.out.println(futureTask.isDone()+" " +futureTask.get());
	}
}
