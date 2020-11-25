package DesignPattern.behavioral.TemplateMethodPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public abstract class AbstractClass {
    
    //基本方法
    protected abstract void operation();
    
    //模板方法
    public void templateMethod(){
        //调用基本方法，完成相关逻辑
        this.operation();
    }
}
