package J2EE.serviceLocatorPattern;

import J2EE.serviceLocatorPattern.Service.Service;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:59
 */
public class MainClass {
    public static void main(String[] args) {
        Service service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
        service = ServiceLocator.getService("Service1");
        service.execute();
        service = ServiceLocator.getService("Service2");
        service.execute();
    }
}
