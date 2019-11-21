package example.Pattern.CreationalPatterns.SingletonPattern;

public class SingleObjectLazy implements IAmSinglePattern{

    private  static SingleObjectLazy instance;
    private SingleObjectLazy(){

    }

    public static SingleObjectLazy getInstance(){
        if(instance == null){
            instance =new  SingleObjectLazy();

        }

        return  instance;
    }

    @Override
    public void say() {
        System.out.println("我是线程不安全的懒汉模式单例，在多线程是不能正常工作！");
    }
}
