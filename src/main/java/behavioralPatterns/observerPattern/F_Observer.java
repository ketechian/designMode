package behavioralPatterns.observerPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 10:49
 */
public class F_Observer extends Observer{
    @Override
    public void update(String msg) {
        System.out.println(F_Observer.class.getName() + " : " + msg);
    }
}
