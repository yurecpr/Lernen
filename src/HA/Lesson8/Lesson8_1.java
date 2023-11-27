package HA.Lesson8;

public class Lesson8_1 {
    public static void main(String[] args) {

        printRes(100);

    }

    public static void printRes(double num) {
        System.out.println(num + "F°" + "= " + +cToF(num) + " C°");
    }

    public static double cToF(double num) {
        double result = 5 * (num - 32) / 9;
        return Math.round(result);
    }
}
