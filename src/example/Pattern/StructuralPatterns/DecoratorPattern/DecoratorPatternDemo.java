package example.Pattern.StructuralPatterns.DecoratorPattern;

public class DecoratorPatternDemo {

    private  static  class  DecoratorHolder{

        private  static  final  DecoratorPatternDemo  INSTANCE = new DecoratorPatternDemo();

    }

    private DecoratorPatternDemo(){

    }

    public  static DecoratorPatternDemo   Instance(){

        return DecoratorHolder.INSTANCE;
    }

    public void showDecoratorPattern(){

        Monkey cloud = new Cloud(); //孙悟空
        cloud.change(); //孙悟空变成云

        Monkey redCloud = new RedCloudDecorator(new Cloud());   //红色的云
        redCloud.change();//悟空变成一朵红色的云

    }



}
