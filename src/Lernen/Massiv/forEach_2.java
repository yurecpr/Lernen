package Lernen.Massiv;

public class forEach_2 {
    public static void main(String[] args) {
        int[] array = {3, 4, 6, 1, 7, 8, 5};
        System.out.println("Index of the element is: " + findIndex(array, 1));
        System.out.println("Index of the element is: " + findIndex(array, 0));
        System.out.println("Index of the element is: " + findIndex(array, 67));
        int[] empty = {};
        System.out.println("Empty: " + findIndex(empty, 1));
        int[] test = new int[10];
        System.out.println("test length is " + test.length);
        for (int x : test) {
            System.out.println(x);
        }


    }

    public static int findIndex(int[] array, int n) {
        if (array.length == 0) {
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                return i;
            }

        }
        return -1;
    }
}
