package com.codegnan.SpringDemo;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class GooglePay implements Payment {

    @Override
    public void makePayment() {
        System.out.println("Payment using GooglePay");
    }
}