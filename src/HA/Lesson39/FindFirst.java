package HA.Lesson39;

import java.util.List;

public class FindFirst {

    public static void main(String[] args) {

        List<String> strings = List.of("Bill", "Bob", "Ivanovich", "An", "Nikolay");
        String result = findFirstShortestOrLongest(strings);
        System.out.println(result);
    }

    public static String findFirstShortestOrLongest(List<String> strings) {

        String shortest = strings.get(0);
        String longest = strings.get(0);

        for (String str : strings) {

            if (str.length() < shortest.length()) {
                shortest = str;
            }


            if (str.length() > longest.length()) {
                longest = str;
            }
        }


        return strings.indexOf(shortest) < strings.indexOf(longest) ? "Schortest string is: " + shortest : "Longest string is: " + longest;
    }
}
