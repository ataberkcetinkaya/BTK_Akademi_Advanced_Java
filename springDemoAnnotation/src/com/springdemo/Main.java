package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);
		//ilgili config dosyasina gidecek.
		
		ICustomerDal customerDal = context.getBean("database", ICustomerDal.class);
		
		
		customerDal.add();
	
	
	}
}
