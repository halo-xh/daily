package DesignPattern.structural.CompositePattern;

/**
 * Created by Xiao Hong on 2020-07-22
 */
//叶子构件
public class Leaf implements Component {
    
    
    @Override
    public void operation() {
        System.out.println("leaf..");
    }
}
