package DesignPattern.BridgePattern.example;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        Color color = new Red();
        AbstractShape shape = new Square(color);
        shape.draw();
    }
}
