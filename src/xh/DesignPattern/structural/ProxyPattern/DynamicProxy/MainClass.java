package DesignPattern.structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.Proxy;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class MainClass {
    
    public static void main(String[] args) {
        DynamicProxySubject dynamicProxySubject = new DynamicProxySubject(new SubjectImpl());
        
        System.getProperties().put("sun.misc.Proxygenerator.saveGeneratedfiles","true");
        
        Subject subject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(),new Class[]{Subject.class},dynamicProxySubject);
        
        subject.method1();
        subject.method2();
    }
}
