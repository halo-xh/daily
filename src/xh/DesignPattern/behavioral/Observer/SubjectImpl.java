package DesignPattern.behavioral.Observer;

import java.util.Vector;
import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public class SubjectImpl implements Subject {
    
    private ConcurrentLinkedQueue<Observer> observers = new ConcurrentLinkedQueue<>();
    
    @Override
    public void attache(Observer o) {
        observers.add(o);
    }
    
    @Override
    public void detache(Observer o) {
        observers.remove(o);
    }
    
    @Override
    public void notifyObserver() {
        observers.forEach(Observer::update);
    }
}
