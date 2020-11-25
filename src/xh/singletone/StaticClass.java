package singletone;

//静态内部类
public class StaticClass {

    private static class Inner{
        private static StaticClass staticClass = new StaticClass();
        public Inner() {
            System.out.println("inner cons"+staticClass);
        }
    }

    public StaticClass() {
        System.out.println("outer construtor");
    }

    public static StaticClass getStaticClass() {
        return Inner.staticClass;
    }

}
