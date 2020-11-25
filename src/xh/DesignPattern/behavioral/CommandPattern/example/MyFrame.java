package DesignPattern.behavioral.CommandPattern.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Xiao Hong on 2020-07-27
 */
public class MyFrame extends JFrame implements ActionListener {
    
    private JPanel panel;
    private YellowCommand yellowCommand;
    private RedCommand redCommand;
    private ExitCommand exitCommand;
    
    public MyFrame(){
        super("Command Pattern");
        panel = new JPanel();
        this.add(panel);
        //实例化具体命令
        yellowCommand = new YellowCommand("yellow",panel);
        redCommand = new RedCommand("red",panel);
        exitCommand = new ExitCommand("exit");
        //将按钮添加到面板
        panel.add(yellowCommand);
        panel.add(redCommand);
        panel.add(exitCommand);
        //添加监听对象
        yellowCommand.addActionListener(this);
        redCommand.addActionListener(this);
        exitCommand.addActionListener(this);
        //设置窗体
        this.setSize(400,300);
        this.setVisible(true);
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        MyCommand myCommand = (MyCommand) e.getSource();
        myCommand.execute();
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
}
