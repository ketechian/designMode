package structuralPatterns.filterPattern.filter;

import structuralPatterns.filterPattern.domain.Person;

import java.util.List;

/**
 * @Description 与过滤器,过滤同时满足多个条件的
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:09
 */
public class AndFilter implements Filter{
    private Filter one;
    private Filter other;

    public AndFilter(Filter one, Filter other) {
        this.one = one;
        this.other = other;
    }

    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> tmp = one.filter(people);
        return other.filter(tmp);
    }
}
