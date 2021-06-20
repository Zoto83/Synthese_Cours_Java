package _30_Design_Patterns.Factory;

public class App {
    public static void main(String[] args) {
        ImplementationInterface monImp = Factory.getImplementation();
    }
}
