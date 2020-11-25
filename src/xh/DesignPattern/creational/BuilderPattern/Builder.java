package DesignPattern.creational.BuilderPattern;

/**
 * Created by Xiao Hong on 2020-07-16
 */
public interface Builder {

    void  setP1();
    
    void  setP2();
    
    void  setP3();
    
    Product build();
    
    
}
