package DesignPattern.behavioral.ChainOfResponsibilityPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler();
        Handler h2 = new ConcreteHandler();
        h1.setSuccessor(h2);
        h1.handleRequest();
    }
}
