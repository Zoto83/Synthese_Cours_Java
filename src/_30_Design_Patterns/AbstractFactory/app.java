package _30_Design_Patterns.AbstractFactory;

/* L'abstract factory permet de créer des produit concret respectant une interface abstraite suivant des factories différentes
 * Par exemple on utilisera 2 factories différentes suivant si l'on souhaite des formes géométriques avec des angles droits ou arondis
 * On utilise ensuite des objet concrets pour la forme (rectangle, triangle, hexagone)
 */
public class app {
    static AbstractProductA abstractProductA;
    static AbstractProductB abstractProductB;
    static AbstractFactory concreteFactory;
    public static void main(String[] args) {
        concreteFactory = AbstractFactory.getConcreteFactory(1);
        concreteFactory.createProductA().toString1();
        concreteFactory.createProductB().toString1();

        concreteFactory = AbstractFactory.getConcreteFactory(2);
        concreteFactory.createProductA().toString1();
        concreteFactory.createProductB().toString1();
    }
}
