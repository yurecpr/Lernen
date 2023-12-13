package HA.Lesson25.Truck;

public class Truck extends Vehicle {
    public Truck(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        super(model, manufacturer, year, color, maxWeight, maxFuel, owner);
    }


    public void load(int weight) {
        if (weight > getRemainingCapacity()) {
            System.out.println("This is too heavy for me!  Can't continue");
            printRemainingCapacity();
            return;
        }

        currentWeight += weight;
        System.out.println("Loading " + weight + " kg......");
        System.out.println("Loaded " + weight + " kg.");
        printRemainingCapacity();
    }


    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo !");
            printRemainingCargo();
            return;
        }

        if (unloadingWeight < 0) {
            System.out.println("Can't unload negative weight");
            return;
        }

        currentWeight -= unloadingWeight;
        System.out.println("Unloading " + unloadingWeight + " kg....");
        System.out.println("Unloaded " + unloadingWeight + " kg.");
        printRemainingCargo();
    }

    private void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + " kg");
    }


    public void move() {
        super.move();
    }

    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah!");
    }


    public String getOwner() {
        return "The owner is " + owner;
    }

    private void printRemainingCapacity() {
        System.out.println("Remaining capacity " + getRemainingCapacity() + " kg");
    }

    private int getRemainingCapacity() {
        return maxWeight - currentWeight;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model= " + model +
                ", manufacturer=" + manufacturer +
                ", year=" + year +
                ", color= " + color +
                ", maxWeight=" + maxWeight +
                ", maxFuel=" + maxFuel +
                ", owner= " + owner +
                '}';
    }
}