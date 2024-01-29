package HA.Lesson48Time;

import java.time.*;

public class Main {
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println("Now: " + currentDate);


        int year = currentDate.getYear();
        int month = currentDate.getMonthValue();
        int day = currentDate.getDayOfMonth();
        System.out.println("Now " + year + ", " + month + ", " + day);


        LocalDate birthday = LocalDate.of(1982, 4, 30);
        System.out.println("Birthday: " + birthday);


        LocalDate date1 = LocalDate.of(2024, 01, 29);
        LocalDate date2 = LocalDate.of(2024, 01, 29);
        System.out.println("Date 1: " + date1);
        System.out.println("Date 2: " + date2);
        if (date1.equals(date2)) {
            System.out.println("Dates are equal");
        } else {
            System.out.println("Dates not equal");
        }


        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);


        LocalTime laterTime = currentTime.plusHours(3);
        System.out.println("Current time + 3 hours: " + laterTime);


        LocalDate nextWeek = currentDate.plusWeeks(1);
        System.out.println("Current date+ 1 weeks: " + nextWeek);

    }
}