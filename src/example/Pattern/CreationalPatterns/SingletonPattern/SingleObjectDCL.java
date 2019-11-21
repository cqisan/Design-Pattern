package example.Pattern.CreationalPatterns.SingletonPattern;

public class SingleObjectDCL implements IAmSinglePattern {


    private volatile static SingleObjectDCL instance;

    private SingleObjectDCL() {

    }

    public static SingleObjectDCL getInstance() {


        if (instance == null) {
            synchronized (SingleObjectDCL.class) {
                if (instance == null) {
                    instance = new SingleObjectDCL();
                }
            }
        }

        return instance;
    }


    @Override
    public void say() {
            System.out.println("双检锁/双重校验锁（DCL，即 double-checked locking）JDK 版本：JDK1.5 起,这种方式采用双锁机制，安全且在多线程情况下能保持高性能");
    }
}
