package HA.Lesson17;

public class task2 {
    public static void main(String[] args) {
        System.out.println(removeCharAtIndex("Hello", 3));

    }

    public static String removeCharAtIndex(String str, int index) {
        return str.substring(0, index) + str.substring(index + 1);
    }
}
