package HA.Lesson21;

public class Dog {
    String name;
    static int counter;

    public Dog(String name) {
        this.name = name;
        counter++;
    }

    public static void main(String[] args) {
        Dog dog1 = new Dog("Jack");
        Dog dog2 = new Dog("Rick");
        Dog dog3 = new Dog("Falko");

        System.out.println("Total dogs: " + Dog.counter);

    }
}
