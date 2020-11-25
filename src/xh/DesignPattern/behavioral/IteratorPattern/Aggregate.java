package DesignPattern.behavioral.IteratorPattern;

/**
 * Created by Xiao Hong on 2020-07-28
 */
public interface Aggregate {
    
    void add(Object o);
    
    Iterator createIterator();
}
