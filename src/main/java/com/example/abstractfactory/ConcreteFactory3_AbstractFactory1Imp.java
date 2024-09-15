package com.example.abstractfactory;

public class ConcreteFactory3_AbstractFactory1Imp implements AbstractFactory{
    @Override
    public ProductA createProductA()
    {

        return new ConcreteProductA1_ProductA1Imp();
    }

    @Override
    public ProductB createProductB()
    {
        return new ConcreteProductB2_ProductB2Imp();
    }
}
