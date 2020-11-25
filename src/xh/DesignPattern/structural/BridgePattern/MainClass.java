package DesignPattern.BridgePattern;


/**
 * Created by Xiao Hong on 2020-07-23
 */
public class MainClass {
    
    public static void main(String[] args) {
        Implementor implementor = new ConcreteImplementor();
        Abstraction abstraction = new RefinedAbstraction(implementor);
        abstraction.operation();
    }
    
    
}
