package Lernen.while_loop;

import java.util.Scanner;

public class DuWhile {
    public static void main(String[] args) {

        sumEvenAndOdd();

    }

    static void sumEvenAndOdd() {
        Scanner scanner = new Scanner(System.in);
        int number;
        int evenSum = 0;
        int oddSum = 0;
        char choice = 'y';

        while (choice == 'y') {
            System.out.println("Enter a number: ");
            number = scanner.nextInt();

            if (number % 2 == 0) {
                evenSum = evenSum + number;
//            evenSum+=number;
            } else {
                oddSum = oddSum + number;
//    oddSum+=number;
            }
            System.out.println("Do you want to enter another number?" + "Press y if yes or any other key if not");
            choice = scanner.next().charAt(0);

        }
        System.out.println("Sum even:" + evenSum);
        System.out.println("Sum odd:" + oddSum);
    }
}
