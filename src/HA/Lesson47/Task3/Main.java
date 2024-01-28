package HA.Lesson47.Task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String firstString = "a aabas aaaa aaaabar";
        String secondString1 = "a";
        String secondString2 = "aaa";
        String secondString3 = "aaaa";

        System.out.println(countWordsStartingWithSecond(firstString,secondString1));
        System.out.println(countWordsStartingWithSecond(firstString, secondString2));
        System.out.println(countWordsStartingWithSecond(firstString, secondString3));
    }

    public static long countWordsStartingWithSecond(String firstString, String secondString) {
        return Arrays.stream(firstString.split(" "))
                .filter(word -> word.startsWith(secondString))
                .count();
    }
}

