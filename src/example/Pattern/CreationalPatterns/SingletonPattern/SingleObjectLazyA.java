package example.Pattern.CreationalPatterns.SingletonPattern;

public class SingleObjectLazyA implements IAmSinglePattern {

    private static SingleObjectLazyA instance;

    private SingleObjectLazyA() {

    }

    public static synchronized SingleObjectLazyA getInstance() {
        if (instance == null) {

            instance = new SingleObjectLazyA();
        }
        return instance;
    }

    @Override
    public void say() {
        System.out.println("我是线程安全的懒汉模式单例，因为有锁，所以效率很低！");
    }
}
