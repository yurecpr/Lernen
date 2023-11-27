package HA.Lesson11;

public class task1_lern {
    public static void main(String[] args) {
        printMult(3);
    }

    static void printMult(int n) {
        int i = 0;
        while (i <= n) {
            System.out.println(n + "*" + i + " = " + n * i);
            i++;
        }
    }
}
