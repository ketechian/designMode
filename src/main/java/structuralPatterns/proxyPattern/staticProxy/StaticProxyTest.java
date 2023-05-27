package structuralPatterns.proxyPattern.staticProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:32
 */
public class StaticProxyTest {
    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        Integer integer = proxy.letOut();
        System.out.println("你一共花了" + integer + "元成功租房，全程没有见过房东，中介把你们隔离开");
    }
}
