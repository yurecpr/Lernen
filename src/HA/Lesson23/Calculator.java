package HA.Lesson23;

public class Calculator {

    public static int add(int a, int b) {
        return a + b;
    }


    public static int subtract(int a, int b) {
        return a - b;
    }


    public static int add(int a, int b, int c) {
        return a + b + c;
    }


    public static int subtract(int a, int b, int c) {
        return a - b - c;
    }

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double add(double a, double b, double c) {
        return a + b + c;
    }

    public static double subtract(double a, double b, double c) {
        return a - b - c;
    }

    public static void main(String[] args) {
        int Res1 = add(2, 2);
        int Res2 = subtract(14, 2);
        int Res3 = add(1, 2, 3);
        int Res4 = subtract(30, 15, 5);

        double doubleRes1 = add(7.5, 5.2);
        double doubleRes2 = subtract(20.1, 4.5);
        double doubleRes3 = add(2.9, 4.4, 1.3);
        double doubleRes4 = subtract(30.5, 4.1, 3.4);


        System.out.println("Integers:");
        System.out.println("Addition: " + Res1);
        System.out.println("Subtraction: " + Res2);
        System.out.println("Addition three numbers: " + Res3);
        System.out.println("Subtraction three numbers: " + Res4);
        System.out.println();
        System.out.println("Double resault:");
        System.out.println("Addition: " + doubleRes1);
        System.out.println("Subtraction: " + doubleRes2);
        System.out.println("Addition three numbers: " + doubleRes3);
        System.out.println("Subtraction three numbers: " + doubleRes4);
    }
}
