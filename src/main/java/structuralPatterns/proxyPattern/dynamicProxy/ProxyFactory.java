package structuralPatterns.proxyPattern.dynamicProxy;

import java.lang.reflect.Proxy;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:58
 */
public class ProxyFactory {
    public static <T> Object getProxy(final T t) {

        //返回一个代理对象
        Object object = Proxy.newProxyInstance(t.getClass().getClassLoader(), t.getClass().getInterfaces(), new InvocationHandler() {
            //invoke（）方法是因为new InvocationHandler()而重写的。
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                // proxy就是目标对象，method就是调用目标对象中方法，args就是调用目标对象中方法的参数。
                //比如说：代理对象.method1(),这时proxy就是目标类，method1就是method,args就是method1方法参数。
                System.out.println("执行方法前...");
                //执行了invoke方法就相当于把Target（目标类）的所有方法都交给代理类去调用，这里都t是类，args是参数，可以有很多参数。
                Object invoke = method.invoke(t, args);
                System.out.println("执行方法后...");
                return invoke;
            }
        });

        return object;
    }
}
