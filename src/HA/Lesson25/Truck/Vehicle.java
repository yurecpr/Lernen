package HA.Lesson25.Truck;

public class Vehicle {
    String model;
    String manufacturer;
    int year;
    String color;
    int maxWeight;
    int currentWeight = 0;
    int currentFuel = 0;
    int maxFuel;
    String owner;

    public Vehicle(String model,
                   String manufacturer,
                   int year,
                   String color,
                   int maxWeight,
                   int maxFuel,
                   String owner) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
        this.owner = owner;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel, can't drive");
            return;
        }

        if (currentWeight == 0) {
            System.out.println("Please load the truck before driving!");
            return;
        }

        System.out.println("Trying...");
        System.out.println("Trying...");
        System.out.println("Yeah, driving!");
    }

    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }

    public void setCurrentFuel(int currentFuel) {
        if (currentFuel > maxFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = currentFuel;
    }
}