package DesignPattern.behavioral.IteratorPattern;

import java.util.Vector;

/**
 * Created by Xiao Hong on 2020-07-28
 */
public class ConcreteAggregate implements Aggregate {
    
    private Vector vector = new Vector();
    
    
    @Override
    public void add(Object o) {
        vector.add(o);
    }
    
    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(this);
    }
    
    public int size(){
        return vector.size();
    }
    
    public Object getElement(int index){
        if (index < vector.size()){
            return vector.get(index);
        }else {
            return null;
        }
    }
    
    
}
