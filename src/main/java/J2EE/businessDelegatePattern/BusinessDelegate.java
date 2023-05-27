package J2EE.businessDelegatePattern;

/**
 * @Description 创建业务代表
 * @Author: HZY
 * @CreateTime: 2022/4/11 20:36
 */
public class BusinessDelegate {
    private BusinessLookUp lookupService = new BusinessLookUp();
    private BusinessService businessService;
    private String serviceType;

    public void setServiceType(String serviceType){
        this.serviceType = serviceType;
    }

    public void doTask(){
        businessService = lookupService.getBusinessService(serviceType);
        businessService.doProcessing();
    }
}
