package Lernen.Massiv;

public class powerNumber {
    public static void main(String[] args) {
        System.out.println(findPower(4, 2));

    }

    public static int findPower(int number, int power) {
        int result = 1;
        for (int i = 1; i <= power; i++) {
            result = result * number;
        }
        return result;
    }


}
