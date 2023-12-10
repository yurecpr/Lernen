package Lernen.method.Static;

import javax.print.attribute.standard.PrinterName;

public class Car {
    String brand;

    int year;
    static int counter;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        counter++;
    }

    public static void sum() {
        System.out.println(1 + 2);
    }

    public void printName() {
        System.out.println(this.brand);
    }

    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2020);
        Car car2 = new Car("Audi", 2021);
        System.out.println("Total car: " + Car.counter);
        car2.printName();
        Car.sum();

    }
}
