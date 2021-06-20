package _30_Design_Patterns.AbstractFactory;

import _30_Design_Patterns.AbstractFactory.factories.ConcreteFactory1;
import _30_Design_Patterns.AbstractFactory.factories.ConcreteFactory2;

public abstract class AbstractFactory {
    public abstract AbstractProductA createProductA();
    public abstract AbstractProductB createProductB();
    public static AbstractFactory getConcreteFactory(int intTypeProduct){
        AbstractFactory retour = null;
        switch (intTypeProduct){
            case 1 : retour = new ConcreteFactory1(); break;
            case 2 : retour = new ConcreteFactory2(); break;
        }
        return retour;
    }
}
