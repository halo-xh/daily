package DesignPattern.structural.CompositePattern;

/**
 * Created by Xiao Hong on 2020-07-22
 */
public class MainClass {
    
    public static void main(String[] args) {
        //根节点
        Composite root = new Composite();
        //创建树枝节点
        Composite branch = new Composite();
        //创建叶子节点
        Leaf leaf = new Leaf();
        //构件树形结构
        root.add(branch);
        branch.add(leaf);
        display(root);
    }
    
    public static void display(Composite root){
        for (Component component : root.getChild()) {
            if (component instanceof Leaf){//叶子节点
                component.operation();
            }else {//树枝节点
                component.operation();
                display((Composite) component);//递归
            }
        }
    }
}
