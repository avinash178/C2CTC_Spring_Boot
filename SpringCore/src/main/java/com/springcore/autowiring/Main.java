package com.springcore.autowiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		// assigning path of xml file to  ClassPathXmlApplicationContext class
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/autowire.xml");
		
		Amezon a1=(Amezon) context.getBean("amezon1");        // getting bean name 'amezon1 from xml file
		Amezon a2=(Amezon) context.getBean("amezon1");
		
		System.out.println(a1.hashCode());
		
		System.out.println(a2.hashCode());
				
	
	}

}
