package DesignPattern.structural.ProxyPattern.StaticProxy;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        Subject subject = new RealSubject();
        Subject proxySubject = new ProxySubject(subject);
        proxySubject.request();
    }
}
