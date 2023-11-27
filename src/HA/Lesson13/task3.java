package HA.Lesson13;

public class task3 {
    public static void main(String[] args) {
        int a = findMin();
        System.out.println("Min number is: " + a);
    }

    public static int findMin() {
        int[] array = {5, 2, 8, 0, 1, -45};
        int min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;
    }
}



