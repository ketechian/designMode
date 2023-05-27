package structuralPatterns.proxyPattern.staticProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:31
 */
public class Proxy implements IRenting{
    //代理类,可以看作中介
    @Override
    public Integer letOut() {
        Landlady landlady = new Landlady();
        Integer integer = landlady.letOut();
        //现实中，代理类要处理很复杂的业务，甚至是调用其他系统操作一些事。
        System.out.println("中介把房东的房子出租给你并从中渔利100元");
        return integer + 100;
    }
}
