package com.example.abstractfactory;

import org.springframework.stereotype.Component;

@Component
public class ConcreteProductB1_ProductB1Imp implements ProductB {
    @Override
    public void display()
    {
        System.out.println("Concrete Product B1");
    }
}
