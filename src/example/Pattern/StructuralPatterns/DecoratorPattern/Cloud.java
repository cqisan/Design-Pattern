package example.Pattern.StructuralPatterns.DecoratorPattern;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

public class Cloud implements Monkey {

    @Override
    public void change() {
        System.out.println("Monkey change to Cloud !");
    }
}
