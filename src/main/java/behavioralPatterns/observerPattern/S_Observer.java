package behavioralPatterns.observerPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 10:49
 */
public class S_Observer extends Observer{
    @Override
    public void update(String msg) {
        System.out.println(S_Observer.class.getName() + " : " + msg);
    }
}
