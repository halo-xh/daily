package DesignPattern.structural.AdapterPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class Adapter extends Adaptee implements Target { //这一行才是适配的关键 连接两端
    
    
    @Override
    public void request() {
        super.specificRequest();//就这?? 偷换?
        
    }
}
