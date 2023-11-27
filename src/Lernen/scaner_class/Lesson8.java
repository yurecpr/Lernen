package Lernen.scaner_class;


public class Lesson8 {
    public static void main(String[] args) {
        printCubed(3);


    }

    public static void printCubed(double number) {
        System.out.println("Number" + number + " cubed=" + cubed(number));

    }


    public static double cubed(double number) {
        double result = Math.PI * number * number;
        return result;

    }
}
