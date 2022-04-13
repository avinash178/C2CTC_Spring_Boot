package com.springcore.constructor;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AccessData {
	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/constructor/beans.xml");
		PersonData p1 = (PersonData) context.getBean("Pdata1");
		PersonData p2 = (PersonData) context.getBean("Pdata2");
		System.out.println(p1);
		System.out.println("------------------------------------");
		System.out.println(p2);

	}

}
