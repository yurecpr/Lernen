package HA.Lesson13;

public class task1 {
    public static void main(String[] args) {
        System.out.println("Arrey nums in loop");
        String[] fruits = new String[]{"Orange", "Apple", "Banana", "Mango"};
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fruits[" + i + "] = " + fruits[i]);
        }
        System.out.print(fruits[0] + " => ");
        fruits[0] = "Kiwi";
        System.out.println(fruits[0]);
        for (int i = 0; i < fruits.length; i++) {
            System.out.println("fuits[" + i + "] = " + fruits[i]);
        }
    }
}
