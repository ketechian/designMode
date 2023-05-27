package J2EE.interceptingFilterPattern;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:04
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }

}
