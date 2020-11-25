package prooxy.cglib;

import net.sf.cglib.proxy.Enhancer;

/**
 * author  Xiao Hong
 * date  2020/10/20 21:57
 * description
 */

public class CglibTest {



    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(RealClass.class);
        enhancer.setCallback(new SimpleInterceptor());
        RealClass proxyChildClass = (RealClass) enhancer.create();
        proxyChildClass.method();
    }

}
