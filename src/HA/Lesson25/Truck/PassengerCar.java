package HA.Lesson25.Truck;

public class PassengerCar extends Vehicle {
    public PassengerCar(String model, String manufacturer, int year, String color, int maxWeight, int maxFuel, String owner) {
        super(model, manufacturer, year, color, maxWeight, maxFuel, owner);
    }

    public void move() {
        super.move();
    }


    @Override
    public String toString() {
        return "PassengerCar{" +
                "model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", color='" + color + '\'' +
                ", maxWeight=" + maxWeight +
                ", currentWeight=" + currentWeight +
                ", currentFuel=" + currentFuel +
                ", maxFuel=" + maxFuel +
                ", owner='" + owner + '\'' +
                '}';
    }
}
