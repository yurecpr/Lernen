package HA.Lesson47.Task1;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vovan", 25));
        people.add(new Person("Anna", 30));
        people.add(new Person("Ivan", 25));
        people.add(new Person("Mary", 30));

        Map<Integer, List<Person>> map = groupByAge(people);
        System.out.println(map);
    }

    public static Map<Integer, List<Person>> groupByAge(List<Person> people) {
        return people
                .stream()
                .collect(Collectors.groupingBy(Person::getAge));
    }
}