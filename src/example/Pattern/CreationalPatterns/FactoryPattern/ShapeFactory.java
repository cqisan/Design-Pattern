package example.Pattern.CreationalPatterns.FactoryPattern;

/**
 * 创建型模式
 */
public class ShapeFactory {

    Shape getShapeFactory(String shapeType) {

        switch (shapeType) {
            case "Circle":
                return new Circle();

            case "Square":
                return new Square();

            case "Rectangle":
                return new Rectangle();

            default:
                return null;
        }

    }
}
