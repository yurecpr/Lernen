package Lernen.our_switch;

import java.util.Scanner;

public class DayOfWeek {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter as number of day");

        int dayOfWeek = scan.nextInt();
        switch (dayOfWeek) {
            case 1:
                System.out.println("Montag");
                break;

            case 2:
                System.out.println("Dinstag");
                break;

            case 3:
                System.out.println("Mitwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sontag");
                break;

            default:
                System.out.println("There is now day of week");
        }

    }
}
