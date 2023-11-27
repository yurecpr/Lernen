package Lernen.If_else;

import java.util.Scanner;

public class GuessNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sNumber = 7;


        System.out.println("Guess a number betwen 0 and 9");
        int answer = scanner.nextInt();

        if (answer == sNumber) {
            System.out.println("You are right!!!");
        } else {
            System.out.print("Sorry, the number ");
            if (answer < sNumber)
                System.out.println("is to small");
            else
                System.out.println("is too big");
        }
    }
}
