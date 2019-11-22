package example.Pattern.StructuralPatterns.DecoratorPattern;

public class RedCloudDecorator extends MonkeyDecorator {

    public RedCloudDecorator(Monkey decoratedMonkey) {
        super(decoratedMonkey);

    }

    @Override
    public void change() {
        decoratedMonkey.change();
        setRedCloud(decoratedMonkey);
    }

    private void setRedCloud(Monkey decoratedMonkey) {

        System.out.println("this  is red cloud !");

    }
}

