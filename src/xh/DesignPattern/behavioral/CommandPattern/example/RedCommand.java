package DesignPattern.behavioral.CommandPattern.example;

import javax.swing.*;
import java.awt.*;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class RedCommand extends JButton implements MyCommand {
    
    private JPanel panel;
    
    public RedCommand(String text, JPanel panel) {
        //构造一个按钮
        super(text);
        this.panel = panel;
    }
    
    @Override
    public void execute() {
        //改变面板的背景颜色
        panel.setBackground(Color.RED);
    }
}
