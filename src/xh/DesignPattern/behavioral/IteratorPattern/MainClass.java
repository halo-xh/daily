package DesignPattern.behavioral.IteratorPattern;

/**
 * Created by Xiao Hong on 2020-07-28
 */
public class MainClass {
    
    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        aggregate.add("1");
        aggregate.add("2");
        aggregate.add("3");
        
        Iterator iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
        
    }
}
