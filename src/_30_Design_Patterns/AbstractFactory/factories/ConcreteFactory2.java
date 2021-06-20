package _30_Design_Patterns.AbstractFactory.factories;

import _30_Design_Patterns.AbstractFactory.AbstractFactory;
import _30_Design_Patterns.AbstractFactory.AbstractProductA;
import _30_Design_Patterns.AbstractFactory.AbstractProductB;
import _30_Design_Patterns.AbstractFactory.bo.ProductA2;
import _30_Design_Patterns.AbstractFactory.bo.ProductB2;

public class ConcreteFactory2 extends AbstractFactory {

    @Override
    public AbstractProductA createProductA() {
        return new ProductA2();
    }

    @Override
    public AbstractProductB createProductB() {
        return new ProductB2();
    }
}
