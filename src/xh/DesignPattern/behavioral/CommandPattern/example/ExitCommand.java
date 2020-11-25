package DesignPattern.behavioral.CommandPattern.example;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class ExitCommand extends JButton implements MyCommand {
    
    
    public ExitCommand(String text) {
        super(text);
    }
    
    @Override
    public void execute() {
        //exit
        System.exit(0);
    }
}
