package structuralPatterns.filterPattern.filter;


import structuralPatterns.filterPattern.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description  通过过滤器过滤出年龄大于20的
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:01
 */
public class AgeFilter implements Filter {
    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getAge() > 20) {
                result.add(p);
            }
        }
        return result;
    }
}
