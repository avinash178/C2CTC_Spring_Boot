package com.springcore.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/standalone/collections/beans.xml");
		Student s1=(Student) context.getBean("student1");
		
		
		System.out.println(s1);
		System.out.println(s1.getProperties());
		
	}

}
