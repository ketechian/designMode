package creationalPatterns.singletonPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/5 17:10
 */
public class DoubleCheckedLocking {
    private volatile static DoubleCheckedLocking doubleCheckedLocking;

    private DoubleCheckedLocking() {}

    public static DoubleCheckedLocking getInstance() {
        if(doubleCheckedLocking == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (doubleCheckedLocking == null) {
                    doubleCheckedLocking = new DoubleCheckedLocking();
                }
            }
        }
        return doubleCheckedLocking;
    }
}
