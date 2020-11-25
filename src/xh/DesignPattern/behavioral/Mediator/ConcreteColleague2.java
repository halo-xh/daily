package DesignPattern.behavioral.Mediator;

/**
 * Created by Xiao Hong on 2020-07-29
 */
public class ConcreteColleague2 extends Colleague {
    
    
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }
    
    @Override
    public void action() {
        System.out.println(
                "colleague 2 action method"
        );
    }
}
