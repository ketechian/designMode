package J2EE.interceptingFilterPattern;

import J2EE.interceptingFilterPattern.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 创建过滤器链
 * @Author: HZY
 * @CreateTime: 2022/4/11 22:02
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
