package J2EE.interceptingFilterPattern;

import J2EE.interceptingFilterPattern.filter.AuthenticationFilter;
import J2EE.interceptingFilterPattern.filter.DebugFilter;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:04
 */
public class MainClass {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
