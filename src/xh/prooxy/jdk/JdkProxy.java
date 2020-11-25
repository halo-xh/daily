package prooxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private Object object;

    public JdkProxy(Object object) {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("proxy start........jdk");
        method.invoke(object,args);
        System.out.println("proxy end........jdk");
        return null;
    }
}
