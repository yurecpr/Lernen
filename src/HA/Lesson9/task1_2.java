package HA.Lesson9;

import java.util.Scanner;

public class task1_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num1 = scan.nextInt();
        System.out.println(compare(num1));
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
