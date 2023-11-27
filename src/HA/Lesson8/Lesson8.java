package HA.Lesson8;

public class Lesson8 {
    public static void main(String[] args) {

        printRes(123);
    }

    public static void printRes(double num) {
        System.out.println("Square of the circle = " + squareCircle(num) + " cm²");
    }

    public static double squareCircle(double rad) {
        double result = Math.PI * rad * rad;
        return Math.round(result);
    }
}

