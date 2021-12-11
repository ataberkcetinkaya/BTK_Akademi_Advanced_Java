package com.springdemo;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration //konfig�rasyon dosyasi oldu�unu belirtir.
@ComponentScan("com.springdemo") //"com.springdemo"'daki database i�in t�m class'lari arayacak.
public class IocConfig {

}
