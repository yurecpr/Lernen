package Lernen.Massiv;

public class forEach_1 {
    public static void main(String[] args) {
        int[] numbers = {7, 8, 9, 10, 1};

        int value = 9;
        boolean isFound = false;

        for (int elt : numbers) {
            if (elt == value) {
                isFound = true;
                System.out.println(elt + "--Found");
                break;
            } else
                System.out.println(elt + "--Not found");

        }
    }

}
