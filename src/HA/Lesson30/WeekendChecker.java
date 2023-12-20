package HA.Lesson30;

import java.util.Scanner;

public class WeekendChecker {
    enum Day {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

        public boolean isWeekend() {
            return this == SATURDAY || this == SUNDAY;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input da of weak: ");
        String input = scanner.nextLine();

        boolean found = false;
        for (Day day : Day.values()) {
            if (day.name().equalsIgnoreCase(input)) {
                found = true;
                boolean isWeekend = day.isWeekend();
                System.out.println("Is day weekend? " + isWeekend);
                break;
            }
        }

        if (!found) {
            System.out.println("Wrong input");
        }
    }
}
