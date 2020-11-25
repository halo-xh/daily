package DesignPattern.structural.ProxyPattern.StaticProxy;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class ProxySubject implements Subject {
    
    private Subject subject;
    
    public ProxySubject(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void request() {
        this.brfore();
        subject.request();
        this.after();
    }
    
    //前置操作
    private void brfore(){
        System.out.println("---------before");
    }
    
    //后置操作
    private void after(){
        System.out.println("---------after");
    
    }
}
