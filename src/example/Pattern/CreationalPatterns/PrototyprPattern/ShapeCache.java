package example.Pattern.CreationalPatterns.PrototyprPattern;

/**
 * 原型模式（Prototype Pattern）是用于创建重复的对象，同时又能保证性能。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
 * 创建型模式
 */

import java.util.Hashtable;

public class ShapeCache {

    private static Hashtable<String, PShape> shapeMap = new Hashtable<String, PShape>();

    public static PShape getShape(String shapeId) throws CloneNotSupportedException {

        PShape cachedShape = shapeMap.get(shapeId);
        return (PShape) cachedShape.clone();
    }

    public  static void loadCache(){

        //可以加载数据库中固定的数据，预设值，什么地方需要的时候，直接copy一份
        PCircle circle = new PCircle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        PSquare square = new PSquare();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        PRectangle rectangle = new PRectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(),rectangle);

    }

}
