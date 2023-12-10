package Lernen.method.Static.staticKeyWorld;

public class Car {
    String name;
    int year;
    static int carCounter;

    public Car(String name) {
        this.name = name;
        this.year = 2000;
        carCounter++;
    }


//    public static void setCarCounter(int carCounter) {
//        Car.carCounter = carCounter;
//
//    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static void setCarCounter(int numberOfCras) {
        carCounter = numberOfCras;

    }

    public String getName() {
        return name;
    }

    public static String getCarInfo(Car car) {
        return car.getName() + "  , production year " + car.year;
    }
}