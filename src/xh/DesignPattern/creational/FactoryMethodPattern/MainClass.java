package DesignPattern.creational.FactoryMethodPattern;

/**
 * Created by Xiao Hong on 2020-07-16
 */
public class MainClass {
    
    public static void main(String[] args) {
        Factory factory = new AppleFactory();
        Product product = factory.create();
        product.gone();
    }
}
