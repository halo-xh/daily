package DesignPattern.behavioral.Observer;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public class MainClass {
    
    public static void main(String[] args) {
        Subject subject = new SubjectImpl();
        subject.attache(new ObserverImpl1());
        subject.attache(new ObserverImpl2());
        subject.notifyObserver();
    }
}
