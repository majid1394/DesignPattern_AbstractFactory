package com.example.abstractfactory;

//کلاسی است که محصولات مربوط به یک سبک را تعریف می‌کند.
public class ConcreteFactory1_AbstractFactory1Imp implements AbstractFactory {
    @Override
    public ProductA createProductA()
    {
        return new ConcreteProductA1_ProductA1Imp();
    }

    @Override
    public ProductB createProductB()
    {
        return new ConcreteProductB1_ProductB1Imp();
    }
}
