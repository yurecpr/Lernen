package Lernen.Lesson11;

import java.util.Scanner;

public class loop_2 {
    public static void main(String[] args) {
        printNumbers();
    }

    public static void printNumbers() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Input ibt number to add or 0 for exit: ");
            number = scanner.nextInt();
            printAllNumbersFromAToB(number);

        } while (number != 0);
    }

    public static void printAllNumbersFromAToB(int number) {
        int counter = 0;
        while (counter <= number) {
            System.out.println("  " + counter);
            counter++;
        }

    }
}
