package DesignPattern.BridgePattern.example;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public class Circle extends AbstractShape {
    
    public Circle(Color color) {
        super(color);
    }
    
    @Override
    void draw() {
        System.out.println("draw circle : "+ color.getColor());
    }
}
