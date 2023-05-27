package J2EE.businessDelegatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:34
 */
public class EJBService implements BusinessService{
    @Override
    public void doProcessing() {
        System.out.println("Processing task by invoking EJB Service");
    }
}
