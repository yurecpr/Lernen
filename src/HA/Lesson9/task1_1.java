package HA.Lesson9;

import java.util.Enumeration;

public class task1_1 {
    public static void main(String[] args) {

        System.out.println(compare(-1));
    }

    public static String compare(int num) {
        String result = "";
        if (num > 0) {
            result = ">0";
        } else if (num < 0) {
            result = "<0";
        } else {
            result = "=0";
        }
        return num + result;
    }
}
