package _30_Design_Patterns.Factory;

import _30_Design_Patterns.Factory.Impl.Implementation1;

public class Factory {
    public static ImplementationInterface getImplementation(){
        return new Implementation1();
    }
}
