package innerclass;

//成员内部类
public class memberInnerClass {

    private static int a;

    private int b;

    public static void main(String[] args) {
        memberInnerClass memberInnerClass = new memberInnerClass();
        Inner inner = memberInnerClass.new Inner();
        inner.print();
    }

    public class Inner{

        public void print(){
            System.out.println(" inner print a"+a);
            System.out.println(" inner print b"+b);
        }
    }


}
