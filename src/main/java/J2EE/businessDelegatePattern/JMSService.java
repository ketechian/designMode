package J2EE.businessDelegatePattern;

/**
 * @Description 创建实体服务类
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:35
 */
public class JMSService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking JMS Service");
    }
}
