package Lernen.OOP.encapsulatiuon.Truck;

public class Truck {

    private String model;
    private String manufacturer;
    private String color;
    private String owner;
    private int year;
    private int maxWeight;
    private int currentWeight = 0;
    private int currentFuel = 0;
    private int maxFuel;

    public Truck(String model,
                 String manufacturer,
                 String color,
                 String owner, int year,
                 int maxWeight,
                 int maxFuel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.color = color;
        this.owner = owner;
        this.year = year;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }


    public void load(int weight) {

        if (weight > getRemainingCapacity()) {
            System.out.println("This is to heavy for me! I can't continue");
            printRemainingCapacity();
            return;
        }

        currentWeight += weight;
        System.out.println("Loading " + weight + "tons....");
        System.out.println("loading " + " tons");
        printRemainingCapacity();
    }

    public void unload(int unloadingWeight) {
        if (unloadingWeight > currentWeight) {
            System.out.println("Not enough cargo !");
            printRemainingCargo();
            return;
        }
        if (unloadingWeight < 0) {
            System.out.println("Can't unload negative weight ");
            return;
        }

        currentWeight -= unloadingWeight;
        System.out.println("unloading " + unloadingWeight + " tons...");
        System.out.println("Unloaded " + unloadingWeight + " tons. ");
        printRemainingCargo();

    }


    private void printRemainingCargo() {
        System.out.println("Remaining cargo weight is " + currentWeight + "tons");
    }

    public void move() {
        if (currentFuel == 0) {
            System.out.println("Not enough fuel, can't drive");
            return;
        }
        if (currentWeight == 0) {
            System.out.println("Please load");
            return;
        }

    }


    public void stop() {
        System.out.println("Stopping...");
        System.out.println("Stopping...");
        System.out.println("Yeah");
    }

    public void setCurrentFuel(int curentFuel) {
        if (curentFuel > maxFuel) {
            this.currentFuel = maxFuel;
            return;
        }
        this.currentFuel = curentFuel;
    }

    public String getOwner() {
        return "The owner is " + owner;
    }

    private void printRemainingCapacity() {
        System.out.println("Remaining capacity " + getRemainingCapacity() + " tons");

    }

    private int getRemainingCapacity() {
        return maxWeight - currentWeight;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "model= " + model +
                ", manufacturer=" + manufacturer +
                " color=" + color +
                " owner=" + owner +
                ", year=" + year +
                ", maxWeight=" + maxWeight +
                ", maxFuel=" + maxFuel +
                '}';
    }

}
