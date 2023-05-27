package behavioralPatterns.nullObjectPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 13:30
 */
public class CustomerFactory {
    public static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name){
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }
}
