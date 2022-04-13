package com.springcore.autowiring.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/annotation/autowire.xml");
		Amezon a1=(Amezon) context.getBean("amezon");
	
		
		System.out.println(a1);
		
		
	}

}
