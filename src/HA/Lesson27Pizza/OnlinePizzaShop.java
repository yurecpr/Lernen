package HA.Lesson27Pizza;

import java.util.Scanner;

public class OnlinePizzaShop {
    public static void main(String[] args) {
        PizzaChoice pizzaChoice = new PizzaChoice();
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Choose your pizza:");
            System.out.println("1. Salami Pizza");
            System.out.println("2. Margarita Pizza");
            System.out.println("3. Hawaii Pizza");

            int choice = scanner.nextInt();
            scanner.nextLine();

            String pizzaType;
            switch (choice) {
                case 1:
                    pizzaType = "Salami Pizza";
                    break;
                case 2:
                    pizzaType = "Margarita Pizza";
                    break;
                case 3:
                    pizzaType = "Hawaii Pizza";
                    break;
                default:
                    System.out.println("Wrong choice");
                    continue;
            }

            pizzaChoice.orderPizza(pizzaType);

            System.out.println("Do you want to order another pizza? (yes/no):");
        } while (scanner.nextLine().equalsIgnoreCase("yes"));
    }
}