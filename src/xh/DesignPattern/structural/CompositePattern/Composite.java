package DesignPattern.structural.CompositePattern;

import java.util.ArrayList;

/**
 * Created by Xiao Hong on 2020-07-22
 */
//树枝构件
public class Composite implements Component {
    
    //构件容器
    private ArrayList<Component> componentArrayList = new ArrayList<>();
    
    //添加构件
    public void  add(Component component){
        this.componentArrayList.add(component);
    }
    
    //移除构件
    public void  remove(Component component){
        this.componentArrayList.remove(component);
    }
    
    //获取子构件
    public ArrayList<Component> getChild() {
        return componentArrayList;
    }
    
    @Override
    public void operation() {
        System.out.println("composite..");
    }
}
