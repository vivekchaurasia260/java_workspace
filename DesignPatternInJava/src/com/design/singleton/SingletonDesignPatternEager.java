package com.design.singleton;

public class SingletonDesignPatternEager {
	
	// Eager way of creating singleton object.
	// It's not recommended way in big projects.
	
	private static SingletonDesignPatternEager singletonDesignPatternEager = new SingletonDesignPatternEager();
	
	public static SingletonDesignPatternEager getSingletonDesignPatternEager()
	{
		return singletonDesignPatternEager;
	}
}
