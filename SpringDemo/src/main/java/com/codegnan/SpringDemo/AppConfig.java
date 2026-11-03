package com.codegnan.SpringDemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.codegnan.SpringDemo")
@PropertySource("classpath:application.properties")
public class AppConfig {

    @Bean
    public ShoppingCart shoppingCart() {

        return new ShoppingCart();

    }
}