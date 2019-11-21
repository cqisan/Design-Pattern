package example.Pattern.CreationalPatterns.AbstractFactoryPattern;

public class FactoryProducer {

    public static AbstractFactory getFactory(FactoryType choice) {

        if (choice == FactoryType.Color) {

            return new ColorFactory();
        } else {

            return null;
        }

    }

}
