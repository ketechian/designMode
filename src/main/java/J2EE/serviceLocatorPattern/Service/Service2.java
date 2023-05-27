package J2EE.serviceLocatorPattern.Service;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:55
 */
public class Service2 implements Service {
    @Override
    public void execute() {
        System.out.println("Executing Service2");
    }

    @Override
    public String getName() {
        return "Service2";
    }
}
