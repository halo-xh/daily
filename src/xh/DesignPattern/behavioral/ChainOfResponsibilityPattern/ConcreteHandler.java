package DesignPattern.behavioral.ChainOfResponsibilityPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class ConcreteHandler extends Handler {
    
    @Override
    public void handleRequest() {
        if (getSuccessor() != null){
            getSuccessor().handleRequest();
            System.out.println("请求传递给: "+ getSuccessor());
        }else {
            System.out.println("处理请求。。。");
        }
    }
}
