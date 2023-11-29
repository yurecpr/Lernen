package HA.Lesson15;

public class task1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 0, 0, 8, 10, 0, 22};
        System.out.println(findTen(array));
    }

    public static boolean findTen(int[] array) {
        boolean res = false;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == 10) {
                res = true;
            }
        }
        return res;
    }
}
