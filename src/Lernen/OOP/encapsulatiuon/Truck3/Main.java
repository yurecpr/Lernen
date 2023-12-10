//package Lernen.OOP.encapsulatiuon.Truck3;
//
//
//public class Truck {
//    private String model;
//    private String manufacturer;
//    private int year;
//    private String colour;
//    private double maxWeight;
//    private double maxFuel;
//    private String ownerName;
//    private double currentWeight;
//    private double currentFuel;
//
//    public Truck(String model, String manufacturer, int year, String colour, double maxWeight, double maxFuel, String ownerName) {
//        this.model = model;
//        this.manufacturer = manufacturer;
//        this.year = year;
//        this.colour = colour;
//        this.maxWeight = maxWeight;
//        this.maxFuel = maxFuel;
//        this.ownerName = ownerName;
//        this.currentWeight = 0;
//        this.currentFuel = maxFuel;
//    }
//
//    public void load(double weight) {
//        double remainingCapacity = this.maxWeight - this.currentWeight;
//        if (weight > remainingCapacity) {
//            System.out.println("Превышена грузоподъемность на " + (weight - remainingCapacity) + " кг");
//            System.out.println("Можно загрузить еще " + remainingCapacity + " кг");
//        } else {
//            this.currentWeight += weight;
//            System.out.println("Груз успешно загружен");
//        }
//    }
//
//    public void unload(double weight) {
//        if (weight > this.currentWeight || weight < 0) {
//            System.out.println("Попытка разгрузить больше, чем имеется на борту или отрицательный груз");
//        } else {
//            this.currentWeight -= weight;
//            System.out.println("Груз успешно разгружен");
//        }
//    }
//
//    public void drive() {
//        if (this.currentFuel <= 0 || this.currentWeight <= 0) {
//            System.out.println("Невозможно ехать: отсутствует топливо или груз");
//        } else {
//            System.out.println("Грузовик поехал");
//        }
//    }
//
//    public void stop() {
//        System.out.println("Грузовик остановился");
//    }
//
//    public void refuel(double fuel) {
//        if (this.currentFuel + fuel > this.maxFuel) {
//            System.out.println("Невозможно заправить больше, чем вмещается в бак");
//        } else {
//            this.currentFuel += fuel;
//            System.out.println("Топливо успешно заправлено");
//        }
//    }
//
//    public String getOwnerName() {
//        return ownerName;
//    }
//}
