package HA.Lesson11;

public class task2 {
    public static void main(String[] args) {
        piramide(4);
    }

    static void piramide(int n) {
        int i = 0;
        while (i < n) {
            i++;
            int j = 1;
            while (j <= i) {
                System.out.print(j);
                j++;
            }
            System.out.println();
        }

    }
}

