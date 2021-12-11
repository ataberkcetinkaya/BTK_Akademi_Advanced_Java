package com.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		//applicationContext.xml'i okuyacagimiz söyledik.
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		customerDal.add();
	
	
	}
}
