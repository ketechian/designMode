package structuralPatterns.proxyPattern.dynamicProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 15:01
 */
public class DynamicProxyTest {
    public static void main(String[] args) {

        Target target = new Target();
        TargetInterface proxy = (TargetInterface) ProxyFactory.getProxy(target);
        proxy.method1();
        System.out.println("-------------------------");
        int i = proxy.method2(100);
        System.out.println(i);
    }
}

