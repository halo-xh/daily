package innerclass;

//匿名内部类：要继承一个父类或者实现一个接口、直接用new来生成一个对象引用
public class NoNameInnerClass {

    public static void main(String[] args) {
        new Thread(new Runnable() {//匿名内部类
            @Override
            public void run() {
                System.out.println("aaaaa");
            }
        }).start();

        new Thread(()->System.out.println("asd")).start();
    }

}
