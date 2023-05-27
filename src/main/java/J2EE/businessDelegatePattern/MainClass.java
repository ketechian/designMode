package J2EE.businessDelegatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:38
 */
public class MainClass {
    public static void main(String[] args) {
        BusinessDelegate businessDelegate = new BusinessDelegate();
        Client client = new Client(businessDelegate);

        businessDelegate.setServiceType("EJB");
        client.doTask();

        businessDelegate.setServiceType("JMS");
        client.doTask();
    }
}
