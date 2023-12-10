//package HA.Lesson22;
//
//
//public class CarSalon {
//    public static void main(String[] args) {
//        String[] salon = {"Audi", "BMW", "Ford", "Honda", "Hyundai", "Kia", "Mazda"};
//        CarSalon carSalon = new CarSalon(salon);
//
//        // Пример вызова метода findCar
//        carSalon.findCar("Ford");
//        carSalon.findCar("Toyota");
//    }
//
//    private String[] carsInSalon;
//
//    public CarSalon(String[] cars) {
//        this.carsInSalon = cars;
//    }
//
//
//    public void findCar(String carToFind) {
//        boolean carFound = false;
//
//        for (String car : carsInSalon) {
//            if (car.equalsIgnoreCase(carToFind)) {
//                carFound = true;
//                break;
//            }
//        }
//
//        if (carFound) {
//            System.out.println("Эта машина имеется в наличии");
//        } else {
//            System.out.print("Такой машины нет, возьмите: ");
//            for (String car : carsInSalon) {
//                System.out.print(car + ", ");
//            }
//            System.out.println();
//        }
//    }
//
//
//}
