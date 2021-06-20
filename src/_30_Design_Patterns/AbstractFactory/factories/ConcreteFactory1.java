package _30_Design_Patterns.AbstractFactory.factories;

import _30_Design_Patterns.AbstractFactory.AbstractFactory;
import _30_Design_Patterns.AbstractFactory.AbstractProductA;
import _30_Design_Patterns.AbstractFactory.AbstractProductB;
import _30_Design_Patterns.AbstractFactory.bo.ProductA1;
import _30_Design_Patterns.AbstractFactory.bo.ProductB1;

public class ConcreteFactory1 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA1();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB1();
    }
}
