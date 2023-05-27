package behavioralPatterns.nullObjectPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 10:56
 */
public class RealCustomer extends AbstractCustomer{
    public RealCustomer(String name) {
        this.name = name;
    }

    @Override
    public boolean isNil() {
        return false;
    }

    @Override
    public String getName() {
        return name;
    }
}
