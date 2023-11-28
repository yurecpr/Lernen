package HA.Lesson14;

public class task2 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 6, 8, 6, 0, 22};
        System.out.println(calcEvenNumbers(array));

    }

    public static int calcEvenNumbers(int[] array) {
        int counter = 0;
        for (int element : array) {
            if (element % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
