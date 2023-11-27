package HA.Lesson11;

public class task2_lern {
    public static void main(String[] args) {
        printTriangle(7);
    }

    static void printTriangle(int n) {
        int i = 1;
        while (i <= n) {
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            i++;
            System.out.println();
        }
    }
}
