package HA.Lesson10;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sNumber = 7;
        System.out.println("Guess a number betwen 0 and 9. You have 5 attempts:");

        int y = 1;
        while (y <= 5) {

            int answer = scanner.nextInt();
            if (answer == sNumber) {
                System.err.println("You are right!!!");
                break;
            } else {
                System.out.print("Sorry, the number ");
                if (answer < sNumber)
                    System.out.println("is to small, " + "attempts №" + (5 - y));
                else
                    System.out.println("is too big, " + "attempts №" + (5 - y));
                y++;
            }


        }
    }
}
