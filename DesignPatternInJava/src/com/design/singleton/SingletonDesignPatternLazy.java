package com.design.singleton;

import java.io.Serializable;

public class SingletonDesignPatternLazy implements Serializable, Cloneable {
	
// Now instead of class we use enum
//public enum SingletonDesignPatternLazy {
//	
//	INSTANCE;
//	
//	public void test()
//	{
//		System.out.println("This is to test enum");
//	}
//	
	
//	------------------------------------------------------------------------------------------------------------------
	
	// We created this var because once it will assign address
	// then it will not be null and
	// private to restrict access from outside.
	
	private static SingletonDesignPatternLazy singletonDesignPatternLazy;
	
	/* Steps to make a class Singleton
	 * 
	 * 1. Constructor should be private.
	 * 2. Should have one method in which we can create constructor.
	 * 3. create a field to store object.
	 */
	
	//constructor
	private SingletonDesignPatternLazy() {
		
		// to protect from reflection api
		if(singletonDesignPatternLazy != null)
		{
			throw new RuntimeException("You are trying to break singleton");
		}
	}
	
	
	// Method should be static because if it is non-static
	// then object requires to call this method.
	/*
	 * This is Lazy way because whenever user calls this method then only
	 * Object will created.
	 * 
	 * In this major drawback is when we are working in a multithreaded env
	 * then multiple threads can execute this method and create object.
	 * 
	 * So, to avoid this we need to use synchronized way to do that.
	 * 
	 * We can use sync block / method.
	 */
	
	public static SingletonDesignPatternLazy getSingletonDesignPatternLazy()
	{
		// This method will create object of this class.
		// If we create object directly here then everytime if anyone
		// calls this method then new object will be created that is
		// why we created a static global variable.
		
		if(singletonDesignPatternLazy == null)
		{
			singletonDesignPatternLazy = new SingletonDesignPatternLazy();
		}
		
		// above condition will not work for multithreaded env.
		// We are using s
		if(singletonDesignPatternLazy == null)
		{
			synchronized (SingletonDesignPatternLazy.class) {
				if(singletonDesignPatternLazy == null)
				{
					singletonDesignPatternLazy = new SingletonDesignPatternLazy();
				}
			}
		}
		
		return singletonDesignPatternLazy;	
	}
	
	// Below method is for de-serialization
//	public Object readResolve() {
//		return singletonDesignPatternLazy;
//	}
	
	// Below method is for cloning
	@Override
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
