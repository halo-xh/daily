package DesignPattern.behavioral.IteratorPattern;

/**
 * Created by Xiao Hong on 2020-07-28
 */
public class ConcreteIterator implements Iterator {
    
    private ConcreteAggregate concreteAggregate;
    
    private int index;
    
    private int size;
    
    public ConcreteIterator(ConcreteAggregate concreteAggregate) {
        this.concreteAggregate = concreteAggregate;
        this.index =0;
        this.size = concreteAggregate.size();
    }
    
    @Override
    public Object next() {
        return hasNext()? concreteAggregate.getElement(index++) : null;
    }
    
    @Override
    public boolean hasNext() {
        return index < size;
    }
}
