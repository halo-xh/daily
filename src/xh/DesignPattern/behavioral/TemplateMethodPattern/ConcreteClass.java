package DesignPattern.behavioral.TemplateMethodPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class ConcreteClass extends AbstractClass {
    
    //实现基本方法
    @Override
    protected void operation() {
        System.out.println("ConcreteClass . operation " );
    }
}
