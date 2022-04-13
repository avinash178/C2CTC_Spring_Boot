package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext context= new ClassPathXmlApplicationContext("com/springcore/stereotype/stereoConfig.xml");
		
		Company object1=context.getBean("object1",Company.class);
		
		System.out.println(object1);
		
		
		
	}

}
