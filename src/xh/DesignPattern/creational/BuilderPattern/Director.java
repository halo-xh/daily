package DesignPattern.creational.BuilderPattern;

/**
 * Created by Xiao Hong on 2020-07-16
 */
public class Director {
    private Builder builder;
    
    public Product bd(){
        builder = new BuilderImpl();
        builder.setP1();
        builder.setP2();
        builder.setP3();
        return builder.build();
    }
    
    
}
