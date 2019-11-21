package example.Pattern.CreationalPatterns.AbstractFactoryPattern;

import example.Pattern.CreationalPatterns.FactoryPattern.Shape;

public class ColorFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shape) {
        return null;
    }

    @Override
    public Color getColor(String color) {
        switch (color) {
            case "Red":
                return new Red();
            case "Blue":
                return new Blue();
            case "Green":
                return new Green();
            default:
                return null;
        }
    }


}
