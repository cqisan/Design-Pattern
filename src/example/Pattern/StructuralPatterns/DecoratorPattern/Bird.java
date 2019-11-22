package example.Pattern.StructuralPatterns.DecoratorPattern;

public class Bird  implements  Monkey {


    @Override
    public void change() {
        System.out.println("Monkey  change  to  Bird !");
    }
}
