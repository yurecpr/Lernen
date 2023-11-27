package HA.Lesson11;

public class task1 {
    public static void main(String[] args) {
        printTable();
    }

    static void printTable() {
        int i = 0;
        int n = 4;
        while (i <= n) {
            System.out.println(i * n);
            i++;
        }
    }
}
