package example.Pattern.CreationalPatterns.SingletonPattern;

public class SingleObjectInner implements IAmSinglePattern {

    private static class SingletonHolder {
        private static final SingleObjectInner instance = new SingleObjectInner();
    }

    private SingleObjectInner() {

    }

    public static  SingleObjectInner getInstance() {
        return SingletonHolder.instance;
    }


    @Override
    public void say() {
        System.out.println("登记式/静态内部类,这种方式能达到双检锁方式一样的功效，但实现更简单。 利用了 classloader 机制来保证初始化 instance 时只有一个线程!!");
    }
}
