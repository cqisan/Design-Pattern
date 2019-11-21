package example.Pattern.CreationalPatterns.SingletonPattern;

/**
 * 简单的设计模式之一。这种类型的设计模式属于创建型模式
 */
public class SingleObject implements  IAmSinglePattern{

    private  static  SingleObject instence = new SingleObject();

    private SingleObject(){

    }

    public static SingleObject getInstence(){
        return instence;
    }

    @Override
    public void say() {
        System.out.println("我是饿汉模式的单例！多线程安全！容易产生垃圾对象");
    }
}
