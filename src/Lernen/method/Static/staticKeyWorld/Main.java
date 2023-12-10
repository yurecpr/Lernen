package Lernen.method.Static.staticKeyWorld;

public class Main {

    public static void main(String[] args) {
        Car car = new Car("BMW");
        Car car1 = new Car("BMW1");
        System.out.println(Car.getCarCounter());
        Car.setCarCounter(10);
        System.out.println(Car.getCarCounter());

        System.out.println(Car.getCarInfo(car));

    }

    public void printSmth(String[] args) {
        System.out.println("Hello");

    }
}
