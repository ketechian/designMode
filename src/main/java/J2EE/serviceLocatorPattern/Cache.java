package J2EE.serviceLocatorPattern;

import J2EE.serviceLocatorPattern.Service.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 创建缓存
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:56
 */
public class Cache {
    private List<Service> services;

    public Cache(){
        services = new ArrayList<Service>();
    }

    public Service getService(String serviceName){
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(serviceName)){
                System.out.println("Returning cached  "+serviceName+" object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService){
        boolean exists = false;
        for (Service service : services) {
            if(service.getName().equalsIgnoreCase(newService.getName())){
                exists = true;
            }
        }
        if(!exists){
            services.add(newService);
        }
    }
}
