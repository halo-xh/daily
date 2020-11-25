package DesignPattern.structural.ProxyPattern.DynamicProxy;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class SubjectImpl implements Subject {
    
    
    @Override
    public void method1() {
        System.out.println("SubjectImpl method1");
    }
    
    @Override
    public void method2() {
        System.out.println("SubjectImpl method2");
    }
    
}
