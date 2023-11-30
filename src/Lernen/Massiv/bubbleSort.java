package Lernen.Massiv;

public class bubbleSort {
    public static void main(String[] args) {
        int[] array = {8, 12, 6, 7};
        bubbleSort(array);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i] + " ");
        }

        boolean sorted = true;
        sorted = false;
        System.out.println(sorted);

    }

    public static void bubbleSort(int[] array) {
        boolean sorted = false;
        int temp;

        while (!sorted) {
            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    sorted = false;
                }

            }
            sorted = true;
        }
    }
}