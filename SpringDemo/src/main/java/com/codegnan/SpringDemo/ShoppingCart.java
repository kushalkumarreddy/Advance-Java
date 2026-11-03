package com.codegnan.SpringDemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ShoppingCart {

    @Autowired
    private Product product;

    @Autowired
    private Customer customer;

    @Autowired
    private Payment payment;

    @Autowired
    @Qualifier("phonePe")
    private Payment phonePe;

    public void displayDetails() {

        customer.displayCustomer();

        System.out.println();

        product.displayProduct();

        System.out.println();

        payment.makePayment();

        System.out.println();

        phonePe.makePayment();
    }
}