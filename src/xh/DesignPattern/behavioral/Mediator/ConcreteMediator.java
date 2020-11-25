package DesignPattern.behavioral.Mediator;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public class ConcreteMediator extends Mediator {
    
    private Colleague colleague1;
    private Colleague colleague2;
    
    //中介者模式的业务逻辑方法
    @Override
    public void colleagueChanged(Colleague c) {
        colleague1.action();
        colleague2.action();
    }
    
    
    public void createConcreteMediator(){
        colleague1 = new ConcreteColleague1(this);
        colleague2 = new ConcreteColleague2(this);
    }
    
    public Colleague getColleague1() {
        return colleague1;
    }
    
    public Colleague getColleague2() {
        return colleague2;
    }
}
