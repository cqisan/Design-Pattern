package example.Pattern.BehavioralPatterns.IteratorPattern;

/**
 * 迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式,顺序访问集合对象的元素，不需要知道集合对象的底层表示.
 */
public interface Iterator {

    public boolean hasNext();

    public Object next();

}
