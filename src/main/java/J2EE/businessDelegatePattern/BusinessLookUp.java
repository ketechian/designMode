package J2EE.businessDelegatePattern;

/**
 * @Description 创建业务查询服务
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:36
 */
public class BusinessLookUp {
    public BusinessService getBusinessService(String serviceType){
        if("EJB".equalsIgnoreCase(serviceType)){
            return new EJBService();
        }else {
            return new JMSService();
        }
    }
}
