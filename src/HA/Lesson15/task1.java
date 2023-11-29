package HA.Lesson15;

public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 6, 10, 10, 2};
        System.out.println(calcEvenNumbers(array));

    }

    public static boolean calcEvenNumbers(int[] array) {
        boolean res = false;
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                counter++;
            }
            if (counter == 3) {
                res = true;
            }
        }
        return res;
    }

}
