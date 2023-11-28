package Lernen.Massiv;

public class forEach {
    public static void main(String[] args) {

        int[] numbers = {10, 10, 10, 10, 10};


        int sum = 0;

        for (int x : numbers) {
            sum = sum + x;
            System.out.println("With for-each: " + sum);
        }
        int[] ints = {10, 20, 30, 40, 50};
        System.out.println("Print");
        for (int element : ints)
            if (element == 30)
                System.out.print(element);
    }
}
