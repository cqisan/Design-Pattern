package example.Pattern.StructuralPatterns.DecoratorPattern;

/**
 * 装饰器模式（Decorator Pattern）允许向一个现有的对象添加新的功能，同时又不改变其结构。这种类型的设计模式属于结构型模式，它是作为现有的类的一个包装.
 */
public abstract  class MonkeyDecorator implements Monkey {


    protected Monkey decoratedMonkey;


    public MonkeyDecorator(Monkey decoratedMonkey) {
        this.decoratedMonkey = decoratedMonkey;
    }

    @Override
    public void change() {
        decoratedMonkey.change();
    }
}
