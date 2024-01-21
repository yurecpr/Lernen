package HA.Lesson42Try;

public class Main {
    public static void main(String[] args) {

        try {
            int a = 40 / 0;
        } catch (ArithmeticException e) {
            System.err.println("Typ ArithmeticException: " + e.getMessage());
        }
        try {
            String s = null;
            String m = s.toLowerCase();
        } catch (NullPointerException e) {
            System.err.println("Typ NullPointerException: " + e.getMessage());
        }

        try {
            int[] m = new int[2];
            m[8] = 5;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("Typ ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }


}
