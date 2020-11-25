package DesignPattern.behavioral.Mediator;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public abstract class Colleague {

    private Mediator mediator;
    
    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
    
    //抽象行为方法，由子类实现
    public abstract void action();
    
    //业务方法，改变对象内部状态
    public void change(){
        this.mediator.colleagueChanged(this);
    }
    
    
    public Mediator getMediator() {
        return mediator;
    }
    
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}
