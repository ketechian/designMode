package structuralPatterns.filterPattern;

import structuralPatterns.filterPattern.domain.Gender;
import structuralPatterns.filterPattern.domain.Person;
import structuralPatterns.filterPattern.filter.AgeFilter;
import structuralPatterns.filterPattern.filter.AndFilter;
import structuralPatterns.filterPattern.filter.FemaleFilter;
import structuralPatterns.filterPattern.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:15
 */
public class MainClass {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(22, "yitian", Gender.Male));
        people.add(new Person(23, "zhang3", Gender.Female));
        people.add(new Person(24, "li4", Gender.Male));
        people.add(new Person(25, "wang5", Gender.Female));
        people.add(new Person(13, "zhao6", Gender.Male));
        people.add(new Person(10, "fuck", Gender.Female));

        Filter femaleFilter = new FemaleFilter();
        List<Person> women = femaleFilter.filter(people);
        System.out.println("女人们: " + women);

        Filter ageFilter = new FemaleFilter();
        List<Person> gt20 = ageFilter.filter(people);
        System.out.println("年龄大于20的人: " + gt20);

        Filter andFilter = new AndFilter(femaleFilter, ageFilter);
        System.out.println("既是女性有大于20的人:" + andFilter.filter(people));

    }
}
