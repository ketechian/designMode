package structuralPatterns.proxyPattern.dynamicProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:42
 */
public interface TargetInterface {
    //被代理的两个方法
    void method1();

    int method2(Integer i);
}
