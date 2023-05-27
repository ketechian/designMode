package structuralPatterns.filterPattern.filter;

import structuralPatterns.filterPattern.domain.Person;

import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:03
 */
public interface Filter {
    List<Person> filter(List<Person> people);
}
