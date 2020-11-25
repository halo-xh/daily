package DesignPattern.behavioral.Mediator;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public class ConcreteColleague1 extends Colleague {
    
    
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void action() {
        System.out.println(
                "colleague 1 action method"
        );
    }
}
