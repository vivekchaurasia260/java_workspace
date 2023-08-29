package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        
        Student student1 = (Student) context.getBean("student2");
        
        System.out.println("Student obj " +student1);
    }
}


/* Steps to create maven project
 * 1- create maven project
 * 2- Adding dependencies - core, context
 * 3- creating beans - POJO
 * 4- creating configuration file -> config.xml
 * 5- setter injection
 * 6- Main class - which can pull the object 
 */