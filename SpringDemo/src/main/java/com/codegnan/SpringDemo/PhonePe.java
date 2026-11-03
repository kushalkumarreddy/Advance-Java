package com.codegnan.SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class PhonePe implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment using PhonePe");
    }
}