package example;

import example.Pattern.BehavioralPatterns.ChainofResponsibilityPattern.AbstractLogger;
import example.Pattern.BehavioralPatterns.ChainofResponsibilityPattern.ChinaPatternDemo;
import example.Pattern.BehavioralPatterns.CommandPattern.CommandPatternDemo;
import example.Pattern.BehavioralPatterns.InterpreterPattern.InterpreterPatternDemo;
import example.Pattern.BehavioralPatterns.IteratorPattern.IteratorPatternDemo;
import example.Pattern.CreationalPatterns.AbstractFactoryPattern.AbstractFactory;
import example.Pattern.CreationalPatterns.AbstractFactoryPattern.Color;
import example.Pattern.CreationalPatterns.AbstractFactoryPattern.FactoryProducer;
import example.Pattern.CreationalPatterns.AbstractFactoryPattern.FactoryType;
import example.Pattern.CreationalPatterns.BuilderPattern.Meal;
import example.Pattern.CreationalPatterns.BuilderPattern.MealBuilder;
import example.Pattern.CreationalPatterns.FactoryPattern.Shape;
import example.Pattern.CreationalPatterns.PrototyprPattern.PShape;
import example.Pattern.CreationalPatterns.PrototyprPattern.ShapeCache;
import example.Pattern.StructuralPatterns.AdapterPattern.AudioPlayer;
import example.Pattern.StructuralPatterns.BridgePattern.BCircle;
import example.Pattern.StructuralPatterns.BridgePattern.BShape;
import example.Pattern.StructuralPatterns.BridgePattern.GreenCircle;
import example.Pattern.StructuralPatterns.BridgePattern.RedCircle;
import example.Pattern.StructuralPatterns.CompositePattern.CompositePatternDemo;
import example.Pattern.StructuralPatterns.DecoratorPattern.Cloud;
import example.Pattern.StructuralPatterns.DecoratorPattern.DecoratorPatternDemo;
import example.Pattern.StructuralPatterns.DecoratorPattern.Monkey;
import example.Pattern.StructuralPatterns.DecoratorPattern.RedCloudDecorator;
import example.Pattern.StructuralPatterns.FacadePattern.FlowerMaker;
import example.Pattern.StructuralPatterns.FilterCriteriaPattern.*;
import example.Pattern.StructuralPatterns.FlyweightPattern.FlyweightDemo;
import example.Pattern.StructuralPatterns.ProxyPattern.ProxyPatternDemo;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;
import java.util.ArrayList;
import java.util.List;

@WebService()
public class HelloWorld {
    @WebMethod
    public String sayHelloWorldFrom(String from) {
        String result = "Hello, world, from " + from;
        System.out.println(result);
        return result;
    }

    public static void main(String[] argv) {
//    Object implementor = new HelloWorld ();
//    String address = "http://localhost:9000/HelloWorld";
//    Endpoint.publish(address, implementor);

        System.out.println("isan  Hello  world  !!!");

        AbstractFactory colorFactory = FactoryProducer.getFactory(FactoryType.Color);
        Color colorTemp = colorFactory.getColor("Red");
        colorTemp.fill();

        System.out.println("\n\n-------------!!! Meal Menu !!!------------------\n\n");
        MealBuilder mealBuilder = new MealBuilder();


        Meal vegMeal = mealBuilder.VegMeal();
        vegMeal.showItems();

        Meal checkenMeal = mealBuilder.CheckenMeal();
        checkenMeal.showItems();

        Meal beefMeal = mealBuilder.BeefMeal();
        beefMeal.showItems();

        System.out.println("\n\n-------------!!! Prototype  Pattern !!!------------------\n\n");
        ShapeCache.loadCache();

        try {

            PShape clonedShape1 = (PShape) ShapeCache.getShape("1");
            System.out.println(" P  Shape 1: " + clonedShape1.getType());

            PShape clonedShape2 = (PShape) ShapeCache.getShape("2");
            System.out.println(" P  Shape 2: " + clonedShape2.getType());


            PShape clonedShape3 = (PShape) ShapeCache.getShape("3");
            System.out.println(" P  Shape 3: " + clonedShape3.getType());


        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("\n\n-------------!!! Adapter  Pattern !!!------------------\n\n");
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");


        System.out.println("\n\n-------------!!! Bridge  Pattern !!!------------------\n\n");

        BShape redCircle = new BCircle(100, 100, 10, new RedCircle());
        BShape greenCircle = new BCircle(100, 100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();

        FilterPatternDemo.Instance.commandFilterPattern();  //过滤器模式
        CompositePatternDemo.Instance().testEmployee();  //组合模式，以树形形式创建对象
        DecoratorPatternDemo.Instance().showDecoratorPattern(); //装饰器模式

        System.out.println("\n\n-------------!!! Facade  Pattern !!!------------------\n\n");
        FlowerMaker.Instance().showCarnation();//外观模式
        FlowerMaker.Instance().showCloveName();
        FlowerMaker.Instance().showRoseName();

        System.out.println("\n\n-------------!!! Flyweight   Pattern !!!------------------\n\n");
        FlyweightDemo.Instance.show();

        System.out.println("\n\n-------------!!! Proxy   Pattern !!!------------------\n\n");
        ProxyPatternDemo.Instance.show();


        System.out.println("\n\n-------------!!!    Chain of Responsibility Pattern   !!!------------------\n\n");
        AbstractLogger loggerChain = ChinaPatternDemo.Instance.getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");  //输出一次，级别最低
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");  //输出2次，级别是2
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error level information.");  //输出3次，级别是3

        System.out.println("\n\n-------------!!!    Command  Pattern   !!!------------------\n\n");
        CommandPatternDemo.Instance.doCommand();

        System.out.println("\n\n-------------!!!    Interpret   Pattern   !!!------------------\n\n");
        InterpreterPatternDemo.Instance.say();

        System.out.println("\n\n-------------!!!    Iterator   Pattern   !!!------------------\n\n");
        IteratorPatternDemo.getInstance().show();


    }


}
