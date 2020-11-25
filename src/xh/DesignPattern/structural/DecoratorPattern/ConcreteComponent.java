package DesignPattern.structural.DecoratorPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class ConcreteComponent implements Component {
    @Override
    public void operation() {
        System.out.println("ConcreteComponent . operation");
    }
}
