package com.design.singleton;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Main {
	
	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, CloneNotSupportedException {
		/*
		 *	In this pattern we are creating a single object and
		 *	using that single object for different operations. 
		 */
		
		// Now we cannot create object directly from main.
		//new SingletonDesignPattern();
		
//		SingletonDesignPatternLazy singletonDesignPatternLazy1 = SingletonDesignPatternLazy.getSingletonDesignPattern();
//		System.out.println(singletonDesignPatternLazy1.hashCode());
//		
//		SingletonDesignPatternLazy singletonDesignPatternLazy2 = SingletonDesignPatternLazy.getSingletonDesignPattern();
//		System.out.println(singletonDesignPatternLazy2.hashCode());
//		
//		System.out.println(SingletonDesignPatternEager.getSingletonDesignPatternEager().hashCode());
//		System.out.println(SingletonDesignPatternEager.getSingletonDesignPatternEager().hashCode());
		
		
		// How to break Singleton Design Pattern
		
		/*
		 * 1. Reflection API : To break Singleton Pattern.
		 * Solution : 1: if Object exists then throw exception from inside constructor.
		 * 			  2: Use Enum
		 * 
		 * 2. Deserialization : 
		 * Solution : 1: Implementing readResolve() methodm
		 * 
		 * 3. Cloning :
		 * Solution : 1. We just need to return same instance from clone method.
		 */

// --------------------------------- USING ENUM ----------------------------------------------------------------------------
		// by doing this we can protect from Reflection by enum.
		
//		SingletonDesignPatternLazy singletonDesignPatternLazy1 = SingletonDesignPatternLazy.INSTANCE;
//		System.out.println(singletonDesignPatternLazy1.hashCode());
//		singletonDesignPatternLazy1.test();
		
// --------------------------------------------------------------------------------------------------------------------------

//		SingletonDesignPatternLazy singletonDesignPatternLazy = SingletonDesignPatternLazy.getSingletonDesignPattern();
		
//		try
//		{
//			Constructor<SingletonDesignPatternLazy> constructor = SingletonDesignPatternLazy.class.getDeclaredConstructor();
//			constructor.setAccessible(true);
//			SingletonDesignPatternLazy newInstance = constructor.newInstance();
//			System.out.println(newInstance.hashCode());
//		}
//		catch(Exception exc)
//		{
//			exc.printStackTrace();
//		}
	
// -------------------------------------- DESERIALIZATION ----------------------------------------------------------------------
//		SingletonDesignPatternLazy singletonDesignPatternLazy = SingletonDesignPatternLazy.getSingletonDesignPatternLazy();
//		System.out.println(singletonDesignPatternLazy.hashCode());
//		
//		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("abc.obj"));
//		oos.writeObject(singletonDesignPatternLazy);
//	
//		System.out.println("Serialization Done!!");
//		
//		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("abc.obj"));
//		SingletonDesignPatternLazy singletonDesignPatternLazy2 = (SingletonDesignPatternLazy) ois.readObject();
//		
//		System.out.println(singletonDesignPatternLazy2.hashCode());
		
		
// -----------------------------------------CLONING -----------------------------------------------------------------------------
		
		SingletonDesignPatternLazy singletonDesignPatternLazy1 = SingletonDesignPatternLazy.getSingletonDesignPatternLazy();
		System.out.println(singletonDesignPatternLazy1.hashCode());
		
		SingletonDesignPatternLazy singletonDesignPatternLazy2 = (SingletonDesignPatternLazy) singletonDesignPatternLazy1.clone();
		System.out.println(singletonDesignPatternLazy2.hashCode());
	}
}	
