package DesignPattern.structural.ProxyPattern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by Xiao Hong on 2020-07-17
 */
public class DynamicProxySubject implements InvocationHandler {
    
    private Object object;
    
    public DynamicProxySubject(Object object) {
        this.object = object;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            this.before();
            Object result = method.invoke(object, args);
            this.after();
            return result;
    }
    
    
    private void before(){
        System.out.println("--- proxy before");
    }
    
    
    private void after(){
        System.out.println("--- proxy after");
    }
    
}
