package prooxy.cglib;

import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * author  Xiao Hong
 * date  2020/10/20 21:47
 * description
 */

public class SimpleInterceptor implements MethodInterceptor {

    public Object intercept(Object o, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {
        System.out.println("before method");
        Object res = methodProxy.invokeSuper(o, args);// not invoke() method.!!
        System.out.println("after method");
        return res;
    }
}
