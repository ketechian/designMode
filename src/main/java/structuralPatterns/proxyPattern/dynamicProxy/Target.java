package structuralPatterns.proxyPattern.dynamicProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:56
 */
public class Target implements TargetInterface{
    @Override
    public void method1() {
        System.out.println("被代理的method1 running ...相当于做了一些列的业务");
    }

    @Override
    public int method2(Integer i) {
        System.out.println("被代理的method2 running ...并对参数做了处理");
        return i + 10;
    }
}
