package DesignPattern.behavioral.CommandPattern;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class Invoker {
    
    private Command command;
    
    public void setCommand(Command command) {
        this.command = command;
    }
    
    //执行命令
    public void action(){
        this.command.execute();
    }
}
