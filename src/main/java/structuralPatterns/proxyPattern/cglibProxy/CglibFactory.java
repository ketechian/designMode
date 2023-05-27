package structuralPatterns.proxyPattern.cglibProxy;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 15:08
 */
public class CglibFactory implements MethodInterceptor {
    public Object getProxy(Class clazz) {
        //帮我们生成代理对象
        Enhancer enhancer = new Enhancer();
        //设置需要创建子类的类
        enhancer.setSuperclass(clazz);
        //设置要代理的目标类,就是当前类，所以this
        enhancer.setCallback(this);
        //通过字节码技术动态创建子类实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("执行方法前do something。。。");
        Object invoke = methodProxy.invokeSuper(o, objects);
        System.out.println("执行方法后do something。。。");
        return invoke;
    }
}
