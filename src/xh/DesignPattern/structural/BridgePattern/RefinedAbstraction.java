package DesignPattern.BridgePattern;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public class RefinedAbstraction extends Abstraction {
    
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }
    
    //修正父类的方法
    public void operation(){
        //业务代码
    }
}
