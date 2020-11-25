package DesignPattern.creational.FactoryMethodPattern;

/**
 * Apple Factory
 * Created by Xiao Hong on 2020-07-16
 */
public class AppleFactory implements Factory {
    
    
    @Override
    public Product create() {
        return new AppleProduct();
    }
}
