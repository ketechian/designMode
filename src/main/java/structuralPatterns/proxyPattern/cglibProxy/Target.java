package structuralPatterns.proxyPattern.cglibProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 15:07
 */
public class Target {
    /**
     * 注意: final和private方法不会被生成的字类覆盖, 所以不能被代理
     */
    public void method1() {
        System.out.println("被代理的method1 running ...相当于做了一些列的业务");
    }

    public int method2(Integer i) {
        System.out.println("被代理的method2 running ...并对参数做了处理");
        return i + 10;
    }
}
