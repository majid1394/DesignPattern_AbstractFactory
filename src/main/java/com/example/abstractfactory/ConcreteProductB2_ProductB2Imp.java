package com.example.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProductB2_ProductB2Imp implements ProductB {
    @Override
    public void display() {

        System.out.println("Concrete Product B2");
    }
}