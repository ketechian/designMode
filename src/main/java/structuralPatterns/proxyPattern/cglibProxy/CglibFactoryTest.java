package structuralPatterns.proxyPattern.cglibProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 15:10
 */
public class CglibFactoryTest {
    public static void main(String[] args) {
        CglibFactory cglibFactory = new CglibFactory();
        Target proxy= (Target) cglibFactory.getProxy(Target.class);
        proxy.method1();
        System.out.println(proxy.method2(100));
    }
}
