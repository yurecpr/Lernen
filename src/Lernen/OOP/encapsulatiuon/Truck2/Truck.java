package Lernen.OOP.encapsulatiuon.Truck2;

public class Truck {
    private String brand;
    private String model;
    private int year;
    private double maxPayload;

    public Truck(String brand, String model, int year, double maxPayload) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.maxPayload = maxPayload;
    }

    // Геттеры и сеттеры для доступа к данным о грузовике
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double getMaxPayload() {
        return maxPayload;
    }

    public void setMaxPayload(double maxPayload) {
        this.maxPayload = maxPayload;
    }

    public static void main(String[] args) {
        // Создание экземпляра грузовика
        Truck myTruck = new Truck("Volvo", "FH16", 2023, 20000.0);

        // Получение информации о грузовике
        System.out.println("Марка: " + myTruck.getBrand());
        System.out.println("Модель: " + myTruck.getModel());
        System.out.println("Год выпуска: " + myTruck.getYear());
        System.out.println("Максимальная грузоподъемность: " + myTruck.getMaxPayload() + " кг");
    }
}
