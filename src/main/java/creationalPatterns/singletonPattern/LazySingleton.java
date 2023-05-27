package creationalPatterns.singletonPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/5 17:00
 */
public class LazySingleton {
    private static LazySingleton lazySingleton;

    private LazySingleton() {}

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}
