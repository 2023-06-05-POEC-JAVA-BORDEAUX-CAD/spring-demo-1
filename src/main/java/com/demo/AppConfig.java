package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.demo")
public class AppConfig {

    // @Bean
    // public HelloService helloService() {
    // return new HelloService();
    // }

}
