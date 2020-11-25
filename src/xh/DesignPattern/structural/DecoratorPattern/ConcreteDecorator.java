package DesignPattern.structural.DecoratorPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class ConcreteDecorator extends Decorator {
    
    
    public ConcreteDecorator(Component component) {
        super(component);
    }
    
    public void decoratorMethod() {
        System.out.println("ConcreteDecorator.decoratorMethod");
    }
    
    @Override
    public void operation() {
        decoratorMethod();
        super.operation();
    }
    
}
