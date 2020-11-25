package DesignPattern.creational.AbstractFactoryPattern;


/**
 * Created by Xiao Hong on 2020-07-16
 */
public class MainClass {
    
    public static void main(String[] args) {
        Factory factory = new MyFactory();
        ProductA producta = factory.createA();
        ProductB productb = factory.createB();
        producta.gone();
        productb.gone();
    }
}
