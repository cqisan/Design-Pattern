package example.Pattern.CreationalPatterns.AbstractFactoryPattern;

import example.Pattern.CreationalPatterns.FactoryPattern.Shape;

public abstract class AbstractFactory {

    public abstract Shape getShape(String shape);

    public abstract Color getColor(String color);

}
