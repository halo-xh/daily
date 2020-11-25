package DesignPattern.structural.DecoratorPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public abstract class Decorator implements Component {

    
    private Component component;
    
    public Decorator(Component component) {
        this.component = component;
    }
    
    @Override
    public void operation() {
        this.component.operation();
    }
}
