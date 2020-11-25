package DesignPattern.structural.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Xiao Hong on 2020-07-24
 */
public class FlyweightFactory {
    
    private static Map<String, Flyweight> pool = new HashMap<>();
    
    private FlyweightFactory() {}//私有构造方法
    
    public static  Flyweight getFlyweight(String intrinsicState){
        Flyweight flyweight = pool.get(intrinsicState);
        if (flyweight == null){
            flyweight = new ConcreteFlyweight(intrinsicState);
            pool.put(intrinsicState,flyweight);
        }
        return flyweight;
    }
}
