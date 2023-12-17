package HA.Lesson27Pizza;

public class PizzaHawaii extends Pizza {
    public PizzaHawaii() {
        super("Hawaii");
    }


    public void prepare() {
        System.out.println("Preparing Hawaii Pizza: Adding tomato sauce, cheese, ham, and pineapple.");
    }

    public void bake() {
        System.out.println("Baking Hawaii Pizza at 190°C for 14 minutes.");
    }

    public void pack() {
        System.out.println("Packing Hawaii Pizza for delivery.");
    }
}