package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/Bean.xml");
		Car c1=(Car)context.getBean("car1");
		
		System.out.println(c1); 
		
		context.registerShutdownHook();
		
	}

}
