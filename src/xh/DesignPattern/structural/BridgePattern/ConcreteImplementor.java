package DesignPattern.BridgePattern;

/**
 * Created by Xiao Hong on 2020-07-23
 */
//具体实现化角色
public class ConcreteImplementor implements Implementor {
    
    // 方法的实现化实现
    @Override
    public void operation() {
        System.out.println("ConcreteImplementor . operation");
        
    }
}
