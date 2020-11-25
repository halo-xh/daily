package DesignPattern.BridgePattern.example;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public abstract class AbstractShape {
    
    Color color;
    
    public AbstractShape(Color color) {
        this.color = color;
    }
    
    abstract void draw();
}
