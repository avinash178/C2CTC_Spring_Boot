package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/reference/reference.xml");
		Company c1=(Company)context.getBean("com1");
		
		System.out.println(c1);
		
	}

}
