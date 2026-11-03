package com.codegnan.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Customer {

    @Value("${customer.name}")
    private String customerName;

    @Value("${customer.city}")
    private String customerCity;

    public void displayCustomer() {
        System.out.println("Customer Name: " + customerName);
        System.out.println("Customer City: " + customerCity);
    }
}