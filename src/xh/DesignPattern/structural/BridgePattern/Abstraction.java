package DesignPattern.BridgePattern;

/**
 * Created by Xiao Hong on 2020-07-23
 */
//抽象化角色
public abstract class Abstraction {
    
    private Implementor implementor;
    
    public Abstraction(Implementor implementor) {
        this.implementor = implementor;
    }
    
    public void operation(){
        this.implementor.operation();
    }
}
