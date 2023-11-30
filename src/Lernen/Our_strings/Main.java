package Lernen.Our_strings;

import java.util.Arrays;
import java.util.Locale;

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

        String empty = "";
        System.out.println("empty length is: " + empty.length());
//isEmpty
        System.out.println(java.isEmpty());
        System.out.println(empty.isEmpty());

        String str = null;

        String string1 = "Hello";
        String string2 = "Java";
        String result = string1 + " " + string2 + " " + 2023;
        System.out.println(result);
// concat
        String resConcat = string1.concat(" ").concat(string2).concat(" ").concat("2023");
        System.out.println(resConcat);

//join()
        String strJoin = String.join(" ", string1, string2, str1);
        System.out.println(strJoin);

        String name = "Johni";
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(1));
        System.out.println(name.charAt(2));
        System.out.println(name.charAt(3));


        System.out.print("Last symbol of string: ");
        System.out.println(name.charAt(name.length() - 1));

        System.out.println("With for loop:");
        for (int i = 0; i < name.length(); i++)
            System.out.println(name.charAt(i));


        String jack = "Jack";
        String jack1 = "Jack";
        String jack2 = new String("Jack");
        System.out.println(jack == jack1);
        System.out.println("with == " + (jack == jack2));
        System.out.println("with equals: " + jack.equals(jack2));

        System.out.print("Equals ignore case: ");
        String kate = "kAtE";
        String kate1 = "Kate";

        System.out.println(kate.equalsIgnoreCase(kate1));


        System.out.println("hello".toUpperCase());
        System.out.println("HElLo".toLowerCase());

        String s1 = "hello";
        String s2 = "world";
        String s1H = "Hello";
        String s3 = "hell";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s1H));
        System.out.println(s1.compareTo(s3));

        String strigHello = "Hello Java";
        int indexL = strigHello.indexOf('l');
        System.out.println(indexL);
        System.out.println(strigHello.indexOf('e'));

//trim()

        String str11 = "           Hello  java!        ";
        System.out.println(str11);
        System.out.println(str11.trim());

//split()

        String sentence = "Java is a great programming language";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

    }
}
