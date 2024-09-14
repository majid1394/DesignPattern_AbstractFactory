package com.example.abstractfactory;


public class ConcreteFactory2_AbstractFactory2Imp implements AbstractFactory {
    @Override
    public ProductA createProductA() {

        return new ConcreteProductA2_ProductA2Imp();
    }

    @Override
    public ProductB createProductB() {

        return new ConcreteProductB2_ProductB2Imp();
    }
}