package prooxy.jdk;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class TestMain {

    public static void main(String[] args) throws Throwable {
        MethodClass methodClass1 = new MethodClass();

        InvocationHandler meHanlder = new JdkProxy(methodClass1);
        Class<?> methodClass = Proxy.getProxyClass(MethodClass.class.getClassLoader(), MethodInter.class);
        Constructor<?> constructor  = methodClass.getConstructor(InvocationHandler.class);
        MethodInter o = (MethodInter)constructor.newInstance(meHanlder);
        o.print();

       // MethodInter o1 = (MethodInter) Proxy.newProxyInstance(MethodClass.class.getClassLoader(), new Class[]{MethodInter.class}, new JdkProxy(methodClass1));
       // o1.print();


    }
}
