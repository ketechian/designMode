package J2EE.businessDelegatePattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:37
 */
public class Client {
    BusinessDelegate businessService;

    public Client(BusinessDelegate businessService){
        this.businessService  = businessService;
    }

    public void doTask(){
        businessService.doTask();
    }
}
