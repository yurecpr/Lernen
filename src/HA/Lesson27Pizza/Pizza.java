package HA.Lesson27Pizza;

public class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Preparing " + name + "...");
    }

    public void bake() {
        System.out.println("Baking " + name + "...");
    }

    public void pack() {
        System.out.println("Packing " + name + "...");
    }
}