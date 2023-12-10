package HA.Lesson22;


import java.util.Arrays;

public class Autosalon {
    public static void main(String[] args) {
        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
        Autosalon carSalon = new Autosalon(salon);

        // Пример вызова метода findCar
        carSalon.findCar("Audi");
        carSalon.findCar("Toyota");
    }

    public String salon;

    public Autosalon(String[] salon) {
        this.salon = Arrays.toString(salon);
    }

    public void findCar(String carToFind) {
        int index = salon.indexOf(carToFind);

        if (index != -1) {
            System.out.println("This car is available.");
        } else {
            System.out.print("This car is not available, please choose from: " + salon);

        }
    }
}