package J2EE.serviceLocatorPattern;

import J2EE.serviceLocatorPattern.Service.Service1;
import J2EE.serviceLocatorPattern.Service.Service2;

/**
 * @Description 为 JNDI 查询创建 InitialContext
 * @Author: HZY
 * @CreateTime: 2022/4/11 21:55
 */
public class InitialContext {
    public Object lookup(String jndiName){
        if(jndiName.equalsIgnoreCase("SERVICE1")){
            System.out.println("Looking up and creating a new Service1 object");
            return new Service1();
        }else if (jndiName.equalsIgnoreCase("SERVICE2")){
            System.out.println("Looking up and creating a new Service2 object");
            return new Service2();
        }
        return null;
    }
}
