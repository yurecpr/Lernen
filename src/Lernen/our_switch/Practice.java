package Lernen.our_switch;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year ");
        int year = scanner.nextInt();
        System.out.println(1900.0 / 4.0);
        System.out.println(1900.0 / 100.0);
        System.out.println(1900.0 / 400.0);
        boolean result = false;
        boolean a = (year % 4) == 0;
        boolean b = (year % 100) != 0;
        boolean c = (year % 100 == 0) && (year % 400 == 0);
        result = a && (b || c);

        System.out.println("is " + year + " a laeap year? " + result);
    }
}
