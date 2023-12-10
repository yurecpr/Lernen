package Lernen.Our_strings.Practice;

public class temp1 {
    public static void main(String args[]) {
        System.out.println(removeDuplicateChars("hello"));
    }

    public static String removeDuplicateChars(String string) {
        String hello = "Hello";

        int index = hello.indexOf('l', 3);
        if (index == 3)

            return hello.replace("l", "");

        return hello;
    }


}
