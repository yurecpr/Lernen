package HA.Lesson27Pizza;

public class Pizza {
    String name;

    public Pizza(String name) {
        this.name = name;
    }

    public void prepare() {
        System.out.println("Готовим " + name + "...");
    }

    public void bake() {
        System.out.println("Пеким " + name + "...");
    }

    public void pack() {
        System.out.println("Упаковываем " + name + "...");
    }
}