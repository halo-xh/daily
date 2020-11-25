package DesignPattern.creational.AbstractFactoryPattern;


/**
 * Apple Factory
 * Created by Xiao Hong on 2020-07-16
 */
public class MyFactory implements Factory {
    
    @Override
    public ProductA createA() {
        return new ProductAImpl();
    }
    
    @Override
    public ProductB createB() {
        return new ProductBImpl();
    }
}
