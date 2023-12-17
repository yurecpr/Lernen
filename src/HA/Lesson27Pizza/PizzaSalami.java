package HA.Lesson27Pizza;

public class PizzaSalami extends Pizza {
    public PizzaSalami() {
        super("Salami");
    }


    public void prepare() {
        System.out.println("Preparing Salami Pizza: Adding tomato sauce, cheese, salami, and other ingredients.");
    }

    public void bake() {
        System.out.println("Baking Salami Pizza at 200°C for 15 minutes.");
    }

    public void pack() {
        System.out.println("Packing Salami Pizza for delivery.");
    }
}