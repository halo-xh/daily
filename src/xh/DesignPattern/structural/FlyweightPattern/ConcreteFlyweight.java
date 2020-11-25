package DesignPattern.structural.FlyweightPattern;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class ConcreteFlyweight implements  Flyweight {
    
    private String intrinsicState;
    
    public ConcreteFlyweight(String intrinsicState) {
        System.out.println("new "+intrinsicState);
        this.intrinsicState = intrinsicState;
    }
    
    @Override
    public void operation(String extrinsicState) {
        System.out.println("内部状态: " + intrinsicState + "外部状态: " + extrinsicState);
    }
}
