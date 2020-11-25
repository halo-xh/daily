package DesignPattern.behavioral.Observer;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public interface Subject {
    
    void attache(Observer o);
    
    void detache(Observer o);
    
    void notifyObserver();
}
