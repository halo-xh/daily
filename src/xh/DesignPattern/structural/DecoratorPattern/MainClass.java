package DesignPattern.structural.DecoratorPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class MainClass {
    
    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        
        // 装饰
        component  = new ConcreteDecorator(component);
        
        component.operation();
    }
}
