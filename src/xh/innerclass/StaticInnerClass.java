package innerclass;

//静态内部类
public class StaticInnerClass {

    private long aLong;
    private static String outtring = "asdasd";

    static {
        System.out.println("outer static area :"+outtring);
    }
    {
        System.out.println("outer CODE area :"+outtring);
    }

    public StaticInnerClass() {
        System.out.println("outter c");
    }

    private static void outPrint(){
        System.out.println("outer method");
    }

    inner inner = new inner();

    private void get(){
        inner.getInnerStr();
    }

    public static void main(String[] args) {
        /**
         * 加载顺序：
         *  1. 外部类静态变量 静态代码块
         *  2. 内部类静态变量 静态代码块
         *  3. 内部类构造方法
         *  4. 外部类构造方法
         *
         */
        StaticInnerClass staticInnerClass = new StaticInnerClass();//new 的时候就 加载 静态内部类
        //StaticInnerClass.inner inner = new StaticInnerClass().inner;//同样
        /**
         * result:
         * outer static area :asdasd
         * inner static area1
         * inner static areaasdasd
         * -------------------静态资源只加载一次
         * inner c
         * outer method
         * outter c
         * -------------new 外部类
         * inner c
         * outer method
         * outter c
         * -----------new 内部类
         *
         */

    }



    public static class inner{
        private static long ilong = 1L;

        private String innerStr;

        static {
            System.out.println("inner static area" + ilong);
            System.out.println("inner static area" + outtring);// 调用外部静态变量
        }
        public inner() {
            System.out.println("inner c");
            outPrint();//调用外部静态方法
        }

        public static void main(String[] args) {
            System.out.println(" inner main ");
        }


        public String getInnerStr() {
            return innerStr;
        }
    }

}
