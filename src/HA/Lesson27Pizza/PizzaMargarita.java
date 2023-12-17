package HA.Lesson27Pizza;

public class PizzaMargarita extends Pizza {
    public PizzaMargarita() {
        super("Margarita");
    }


    public void prepare() {
        System.out.println("Preparing Margarita Pizza: Adding tomato sauce, cheese, and basil.");
    }

    public void bake() {
        System.out.println("Baking Margarita Pizza at 180°C for 12 minutes.");
    }

    public void pack() {
        System.out.println("Packing Margarita Pizza for delivery.");
    }
}