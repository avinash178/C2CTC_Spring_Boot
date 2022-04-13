package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/collection/collection.config.xml");
		Client c1=(Client) context.getBean("client1");
		
		System.out.println(c1);
		System.out.println("____________________");
		System.out.println(c1.getAddress());
		System.out.println(c1.getCourses());
		System.out.println(c1.getPhones());
		System.out.println(c1.getName());
		
		
	}

}
