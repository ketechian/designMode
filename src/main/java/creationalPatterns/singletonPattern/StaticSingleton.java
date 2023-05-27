package creationalPatterns.singletonPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 08:48
 */
public class StaticSingleton {
    private static class SingletonHolder {
        private static final StaticSingleton INSTANCE = new StaticSingleton();
    }

    private StaticSingleton() {}

    public static final StaticSingleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

}
