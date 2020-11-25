package DesignPattern.creational.AbstractFactoryPattern;


/**
 * 抽象工厂
 * Created by Xiao Hong on 2020-07-16
 */
public interface Factory {
    
    ProductA createA();
    
    ProductB createB();
}
