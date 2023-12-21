package HA.Lesson30;

import java.util.Scanner;

public class WeekdayChecker {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input day of week: ");
        String userInput = scanner.nextLine().toUpperCase();

        Day inputDay = null;
        for (Day day : Day.values()) {
            if (day.name().equals(userInput)) {
                inputDay = day;
                break;
            }
        }

        if (inputDay != null) {
            if (inputDay == Day.SATURDAY || inputDay == Day.SUNDAY) {
                System.out.println("Is day Weekend ? true");
            } else {
                System.out.println("Is day Weekend? false");
            }
        } else {
            System.out.println("Wrong input");
        }
    }
}