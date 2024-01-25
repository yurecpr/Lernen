package HA.Lesson46Stream;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<String> names = List.of("John", "Bil", "Bil", "Vovan", "Anna", "Marina");
        printUniqueNames(names);
    }

    public static void printUniqueNames(List<String> names) {
        names.stream()
                .distinct()
                .forEach(System.out::println);
    }


}
