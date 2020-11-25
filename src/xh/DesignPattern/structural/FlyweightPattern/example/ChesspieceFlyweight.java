package DesignPattern.FlyweightPattern.example;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class ChesspieceFlyweight implements Chesspiece {
    
    private String color;
    
    public ChesspieceFlyweight(String color) {
        this.color = color;
    }
    
    @Override
    public void put(int x, int y) {
        System.out.println("put a " + color + " chess at (" + x + "," + y + ")");
    }
    
}
