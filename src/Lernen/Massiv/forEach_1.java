package Lernen.Massiv;

public class forEach_1 {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 9, 10, 1};

        int value = 9;
        boolean isFound = false;

        for (int el : numbers) {
            if (el == value) {
                isFound = true;
                System.out.println(el + "--Found");
                break;
            } else
                System.out.println(el + "--Not found");

        }
    }

}
