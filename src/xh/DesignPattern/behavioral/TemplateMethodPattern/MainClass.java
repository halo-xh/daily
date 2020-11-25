package DesignPattern.behavioral.TemplateMethodPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class MainClass {
    
    
    public static void main(String[] args) {
        AbstractClass ac = new ConcreteClass();
        ac.templateMethod();//调用模板方法
    }
}
