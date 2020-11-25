package DesignPattern.structural.ProxyPattern.StaticProxy;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class RealSubject implements Subject {
    
    
    @Override
    public void request() {
        System.out.println("real request.");
    }
}
