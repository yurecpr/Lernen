package Lernen.Our_strings;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String java = "Java";
        String str1 = new String("Java");

//Method .lengs
        java = "Hello";
        System.out.println("String java lengs is " + java.length());

//Method .toCharArray

        char[] helloArray = java.toCharArray();
        System.out.println(Arrays.toString(helloArray));
//Empty String

        String empty = " ";
        System.out.println("empty length is: " + empty.length());

    }
}
