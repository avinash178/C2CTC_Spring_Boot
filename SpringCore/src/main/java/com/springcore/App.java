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
        
        
        //creating object of ClassPathXmalApplicationContext
        ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
        
        // creating object of Student by passing bean to context
        Student student1=(Student)context.getBean("student1");
        Student student3=(Student)context.getBean("student3");
        
        
        
        System.out.println(student1);
        System.out.println("------------------------------------------");
        System.out.println(student3);
        
        
        
    }
}
