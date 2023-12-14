package HA.Lesson25.Truck.Evgeniy;

public class PassengerCar extends Car {
    int numberOfSeats;

    public PassengerCar(String model, String manufacturer, int year, String color, String owner, int numberOfSeats) {
        super(model, manufacturer, year, color, owner);
        this.numberOfSeats = numberOfSeats;
    }

    public void move() {
        System.out.println(" passenger car is driving");
    }

    public void stop() {
        System.out.println(" passenger car is stopping ");
    }


    @Override
    public String toString() {
        return "Passenger car{" +
                "model= " + getModel() +
                ", manufacturer=" + getManufacturer() +
                ", year=" + getYear() +
                ", color= " + getColor() +
                ", number of sets=" + numberOfSeats +
                ", owner= " + getOwner() +
                '}';
    }
}
