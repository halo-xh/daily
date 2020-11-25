package DesignPattern.BridgePattern.example;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public class Square extends AbstractShape {
    
    public Square(Color color) {
        super(color);
    }
    
    @Override
    void draw() {
        System.out.println("draw square :" + color.getColor());
    }
}
