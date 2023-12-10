package Lernen.OOP.encapsulatiuon.Truck;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck("SuperTruck", "Volvo", "Black", "Jack", 2020, 5000, 500);
        System.out.println(truck);

        truck.load(3500);
        truck.unload(2000);
        truck.setCurrentFuel(200);
        truck.move();

        Truck truck1 = new Truck("SuperTruck1", "MAN", "Black-Yellow", "Alex", 2022, 10000, 600);
        System.out.println(truck1);

        Truck[] trucks = {truck, truck1};
        System.out.println(Arrays.toString(trucks));

        for (Truck tr : trucks) {
            System.out.println(tr.getOwner() + ", manufacture- " + tr.getManufacturer());
        }

    }


}
