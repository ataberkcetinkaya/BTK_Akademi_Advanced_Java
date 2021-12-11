package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //konfig�rasyon dosyasi oldu�unu belirtir.
@ComponentScan("com.springdemo") //"com.springdemo"'daki database i�in t�m class'lari arayacak.
public class IocConfig {
	@Bean
	public ICustomerDal database() { //ICustomerDal ��nk� msSql'de mySql'de onu implemente eder.
		return new MySqlCustomerDal();
	}
}
