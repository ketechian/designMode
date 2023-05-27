package structuralPatterns.filterPattern.filter;

import structuralPatterns.filterPattern.domain.Gender;
import structuralPatterns.filterPattern.domain.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description 通过过滤器过滤出女性
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:07
 */
public class FemaleFilter implements Filter{
    @Override
    public List<Person> filter(List<Person> people) {
        List<Person> result = new ArrayList<>();
        for (Person p : people) {
            if (p.getGender() == Gender.Female) {
                result.add(p);
            }
        }
        return result;
    }
}
