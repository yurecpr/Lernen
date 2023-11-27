package HA.Lesson10;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Cube=");
        System.out.println();
        printCube(3);
    }

    public static void printCube(int n) {
        int k = 1;
        while (k <= n) {
            System.out.println(k * k * k);
            k++;

        }
//        return k;
    }

}