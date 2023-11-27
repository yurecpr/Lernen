package HA.Lesson12;

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
        smalMathTabl(n);
    }

    public static void smalMathTabl(int n) {
        int sum;
        for (int i = 1; i <= 10; i++) {
            sum = n * i;
            System.out.println(+n + "*" + i + "=" + sum);
        }

    }

}
