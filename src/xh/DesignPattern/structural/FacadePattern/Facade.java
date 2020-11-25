package DesignPattern.FacadePattern;

/**
 * Created by Xiao Hong on 2020-07-23
 */
public class Facade {
    
    //- 被委托的对象
    private SubSystemA subSystemA  = new SubSystemA();
    
    private SubSystemB subSystemB  = new SubSystemB();
    
    private SubSystemC subSystemC  = new SubSystemC();
    
    
    // 向外界 提供的方法
    public void mA(){
        subSystemA.methodA();
    }
    
    public void mB(){
        subSystemB.methodB();
    }
    
    public void mC(){
        subSystemC.methodC();
    }
}
