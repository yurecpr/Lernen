package HA.Lesson46Stream.Task2;


import java.util.List;

public class Main {
    public static void printAddressesOfAdults(List<Person> persons) {
        persons.stream()
                .filter(person -> person.getAge() > 17)
                .map(Person::getAddress)
                .forEach(address -> System.out.println(address.getStreet() + ", " + address.getHouseNumber()));
    }

    public static void main(String[] args) {

        Address address1 = new Address("Street 1 ", 10);
        Address address2 = new Address("Street 2", 20);
        Address address3 = new Address("Street 3", 30);
        Address address4 = new Address("Street 4", 40);

        List<Person> persons = List.of(
                new Person("Vovan", 20, address1),
                new Person("Dimon", 18, address2),
                new Person("Marina", 25, address3),
                new Person("Max", 15, address4)
        );

        printAddressesOfAdults(persons);
    }
}
