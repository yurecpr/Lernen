package HA.Lesson45;

import java.util.function.*;

public class Main {

    public static void main(String[] args) {


//        Concatable concatable = (a, b) -> Integer.toString(a) + b;
        BiFunction<Integer, Integer, String> concatable = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable.apply(1, 3));

//        Checkable checkable = s -> s.length() == 3;
        Predicate<String> checkable = s -> s.length() == 3;
        System.out.println(checkable.test("abc"));
        System.out.println(checkable.test("abcd"));

//        System.out.println("checkable even");
//        checkable = s -> s.length() % 2 == 0;
        Predicate<String> checkableEven = s -> s.length() % 2 == 0;
        System.out.println(checkableEven.test("abc"));
        System.out.println(checkableEven.test("abcd "));

//
//        Transformable transformable = String::toUpperCase;
        Function<String, String> transformable = String::toUpperCase;
        System.out.println(transformable.apply("abcDe"));

//        Transformable transformable1 = s -> s.length() == 4 ? "****" : s;
        Function<String, String> transformable1 = s -> s.length() == 4 ? "****" : s;
        System.out.println(transformable1.apply("ab"));
        System.out.println(transformable1.apply("abcd"));


//        Printable printable = s -> System.out.println("!" + s + "!");
//        printable.print("Hello");
        Consumer<String> printable = s -> System.out.println("!" + s + "!");

        printable.accept("Hello");
//        Producable producable = () -> "Hello World";
        Supplier<String> producable = () -> "Hello World";
        System.out.println(producable.get());

    }
}
