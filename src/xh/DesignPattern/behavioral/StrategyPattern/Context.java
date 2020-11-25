package DesignPattern.behavioral.StrategyPattern;

/**
 * Created by Xiao Hong on 2020-07-28
 */
public class Context {
    
    private Strategy strategy;
    
    //构造函数
    public Context(Strategy strategy) {
        this.strategy = strategy;
    }
    
    // 调用策略方法
    public void contextInterface(){
        this.strategy.stragetyMethod();
    }
}
