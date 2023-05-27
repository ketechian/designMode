package J2EE.interceptingFilterPattern;

import J2EE.interceptingFilterPattern.filter.Filter;

/**
 * @Description 创建过滤管理器
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:03
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
