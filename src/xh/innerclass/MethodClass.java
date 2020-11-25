package innerclass;


//局部内部类 ： 定义在方法中的类
public class MethodClass {

    private static long a;

    private int b;

    public MethodClass() {
        System.out.println("out con");
    }

    public static void test(int qq){
        int zzz = 11;


        class inner{
            String innerstr;
            public inner(String innerstr) {
                System.out.println("inner con");
                this.innerstr = innerstr;
            }
            public void print(){
                System.out.println(" inner zzz" + zzz);
                System.out.println(" inner innerstr" + innerstr);
                System.out.println(" inner qq" + qq);
            }
        }

        inner inner = new inner("innnnnn");
        inner.print();
    }

    public static void main(String[] args) {
        MethodClass methodClass = new MethodClass();
        methodClass.test(123);
    }




}
