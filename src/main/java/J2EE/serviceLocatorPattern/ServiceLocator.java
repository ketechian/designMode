package J2EE.serviceLocatorPattern;

import J2EE.serviceLocatorPattern.Service.Service;

/**
 * @Description 创建定位服务器
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:57
 */
public class ServiceLocator {
    private static Cache cache;

    static {
        cache = new Cache();
    }

    public static Service getService(String jndiName){

        Service service = cache.getService(jndiName);

        if(service != null){
            return service;
        }

        InitialContext context = new InitialContext();
        Service service1 = (Service)context.lookup(jndiName);
        cache.addService(service1);
        return service1;
    }
}
