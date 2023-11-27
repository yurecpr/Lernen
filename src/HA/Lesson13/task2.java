package HA.Lesson13;

public class task2 {
    public static void main(String[] args) {
        System.out.println("Arrey nums in loop");
        String[] fruits = new String[]{"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            if (i % 2 == 0) {
                System.out.println("fruits[" + i + "] = " + fruits[i]);
            }

        }


    }
}
