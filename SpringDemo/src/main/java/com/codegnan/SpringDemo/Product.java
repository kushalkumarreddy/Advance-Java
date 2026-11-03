package com.codegnan.SpringDemo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Product {

    @Value("101")
    private int productId;

    @Value("Laptop")
    private String productName;

    @Value("55000")
    private double productPrice;

    public void displayProduct() {
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Price: " + productPrice);
    }
}