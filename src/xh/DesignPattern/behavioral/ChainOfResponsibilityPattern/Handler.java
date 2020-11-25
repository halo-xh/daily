package DesignPattern.behavioral.ChainOfResponsibilityPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public abstract class Handler {
    
    private Handler successor;
    
    //handler method
    public abstract void handleRequest();
    
    public Handler getSuccessor() {
        return successor;
    }
    
    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }
    
}
