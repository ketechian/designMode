package structuralPatterns.proxyPattern.staticProxy;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/7 14:27
 */
public class Landlady implements IRenting{
    //目标类，也可以说房东
    @Override
    public Integer letOut() {
        System.out.println("房东同意租房，租金100元");
        return 100;
    }
}
