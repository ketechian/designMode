package creationalPatterns.singletonPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/5 16:52
 */
public class HungrySingleton {
    public HungrySingleton() {}

    private final static HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}
