package DesignPattern.structural.AdapterPattern;

/**
 * Created by Xiao Hong on 2020-07-21
 */
public class MainClass {
    
    public static void main(String[] args) {
        Target target= new Adapter();
        target.request();
        
    }
}
