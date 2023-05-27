package structuralPatterns.filterPattern;

import structuralPatterns.filterPattern.domain.Gender;
import structuralPatterns.filterPattern.domain.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description
 * @Author: HZY
 * @CreateTime: 2022/4/6 23:23
 */
public class MainClassLambda {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person(22, "yitian", Gender.Male));
        people.add(new Person(23, "zhang3", Gender.Female));
        people.add(new Person(24, "li4", Gender.Male));
        people.add(new Person(25, "wang5", Gender.Female));
        people.add(new Person(13, "zhao6", Gender.Male));
        people.add(new Person(10, "fuck", Gender.Female));

        //lambda表达式
        List<Person> men = people.stream()
                .filter(o -> o.getGender() == Gender.Male)
                .filter(o -> o.getAge() >= 23)
                .collect(Collectors.toList());
        System.out.println("大于23的男性:" + men);
    }
}
