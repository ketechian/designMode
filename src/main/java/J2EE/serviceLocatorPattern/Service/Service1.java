package J2EE.serviceLocatorPattern.Service;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:54
 */
public class Service1 implements Service{
    @Override
    public void execute(){
        System.out.println("Executing Service1");
    }

    @Override
    public String getName() {
        return "Service1";
    }
}
