package DesignPattern.structural.FlyweightPattern;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class MainClass {
    
    public static void main(String[] args) {
        Flyweight flyweight = FlyweightFactory.getFlyweight("intrinsic");
        flyweight.operation("extrinsic");
        Flyweight flyweight1 = FlyweightFactory.getFlyweight("intrinsic1");
        flyweight1.operation("extrinsic1");
        Flyweight flyweight2 = FlyweightFactory.getFlyweight("intrinsic");
        flyweight2.operation("extrinsic");
    }
    
    
}
