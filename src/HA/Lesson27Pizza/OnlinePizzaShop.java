package HA.Lesson27Pizza;


import java.util.Scanner;

class OnlinePizzaShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PizzaChoice pizzaChoice = new PizzaChoice();

        boolean pizzaOrder = true;

        while (pizzaOrder) {
            System.out.println("Choose the type of pizza:");
            System.out.println("1. Salami");
            System.out.println("2. Margarita");
            System.out.println("3. Hawaii");
            System.out.print("Enter your choice (1-3): ");
            int choice = scanner.nextInt();

            // Создаем объект нужного типа пиццы через класс PizzaChoice
            Pizza pizza = pizzaChoice.choosePizza(choice);

            if (pizza != null) {
                System.out.println("You've ordered:");
                pizza.prepare();
                pizza.bake();
                pizza.pack();
            } else {
                System.out.println("Invalid choice. Please choose again.");
            }

            System.out.print("Do you want to order another pizza? (yes/no): ");
            String orderAgain = scanner.next();

            if (!orderAgain.equalsIgnoreCase("yes")) {
                pizzaOrder = false;
            }
        }

        System.out.println("Thank you for ordering from OnlinePizzaShop!");
        scanner.close();
    }
}