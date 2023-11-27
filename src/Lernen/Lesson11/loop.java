package Lernen.Lesson11;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        int sum = calcSum();
        System.out.println("The result=" + sum);
    }

    public static int calcSum() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        do {
            System.out.println("Input int number to add or 0 for to exit" + sum);
            number = scanner.nextInt();
            sum = sum + number;
        }
        while (number != 0);
        return sum;


    }

}
