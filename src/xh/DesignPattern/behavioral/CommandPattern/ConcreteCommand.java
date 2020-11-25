package DesignPattern.behavioral.CommandPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class ConcreteCommand implements Command {
    
    private Receiver receiver;
    
    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }
    
    @Override
    public void execute() {
        receiver.action();
    }
}
