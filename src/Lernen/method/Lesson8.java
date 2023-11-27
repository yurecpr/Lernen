package Lernen.method;


public class Lesson8 {
    public static void main(String[] args) {
        printCubed(1);


    }

    public static void printCubed(double number) {
        System.out.println("Number" + number + " cubed=" + areaRing(number));

    }


    public static double areaRing(double rad) {
        double result = Math.PI * (2 * rad);
        return result;

    }
}
