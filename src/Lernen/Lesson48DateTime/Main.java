package Lernen.Lesson48DateTime;

import java.time.LocalDate;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);
        LocalTime localTime1 = LocalTime.of(15, 30, 35);
        System.out.println(localTime1.plusHours(2));
        System.out.println(localTime1.plusMinutes(2));

        LocalTime check = LocalTime.of(13, 15);
        System.out.println(check.isBefore(LocalTime.now()));
        System.out.println(check.isAfter(LocalTime.now()));

        System.out.println(LocalTime.MAX);
        System.out.println(LocalTime.MIN);
        System.out.println(LocalTime.MIDNIGHT);
        System.out.println(LocalTime.NOON);

        LocalDate now = LocalDate.now();
        System.out.println(now);

        System.out.println("Is 2024 a leap year? " + now.isLeapYear());
        System.out.println(now.getEra());

    }
}
