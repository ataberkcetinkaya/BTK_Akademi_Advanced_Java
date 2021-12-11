package com.springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //konfigürasyon dosyasi olduðunu belirtir.
@ComponentScan("com.springdemo") //"com.springdemo"'daki database için tüm class'lari arayacak.
public class IocConfig {
	@Bean
	public ICustomerDal database() { //ICustomerDal çünkü msSql'de mySql'de onu implemente eder.
		return new MySqlCustomerDal();
	}
}
