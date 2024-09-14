package com.example.abstractfactory;

import org.springframework.boot.autoconfigure.SpringBootApplication;

// Client code
@SpringBootApplication
public class AbstractFactoryApplication  {

    public static void main(String[] args) {
        AbstractFactory factory1 = new ConcreteFactory1_AbstractFactory1Imp();
        ProductA productA1 = factory1.createProductA();
        ProductB productB1 = factory1.createProductB();

        productA1.display();
        productB1.display();

        AbstractFactory factory2 = new ConcreteFactory2_AbstractFactory2Imp();
        ProductA productA2 = factory2.createProductA();
        ProductB productB2 = factory2.createProductB();

        productA2.display();
        productB2.display();
    }
}

