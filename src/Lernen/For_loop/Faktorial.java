package Lernen.For_loop;

public class Faktorial {
    public static void main(String[] args) {

        int factorial = getFactorial(5);
        System.out.println("Factorial 5= " + factorial);
    }

    public static int getFactorial(int f) {
        int result = 1;
        for (int i = 1; i <= f; i++) {
            result = result * i;
//
        }
        return result;

    }
}
