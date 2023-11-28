package HA.Lesson14;

public class task1 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 1};
        System.out.println(areEqual(array1, array2) ? "Similar" : "Unequal");

    }

    public static boolean areEqual(int[] arrey1, int[] arrey2) {
        if (arrey1.length != arrey2.length) {
            return false;
        }
        for (int i = 0; i < arrey1.length; i++) {
            if (arrey1[i] != arrey2[i]) {
                return false;
            }
        }
        return true;

    }
}