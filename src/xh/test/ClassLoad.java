package test;


class A{
    public A(){
        System.out.println("A constructor");
    }
    //private static A a = new A();


    {
        System.out.println("A code area");
    }

    static {
        System.out.println("A static" );
    }
}
public class ClassLoad extends A{
    public ClassLoad(){
        System.out.println("classlod constructor");
    }

    public static void main(String[] args) {

        System.out.println("-----main");
        ClassLoad classLoad = new ClassLoad();
    }
}
