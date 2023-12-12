package HA.Lesson24;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        Dog dog = new Dog();
        dog.eat();
        dog.sleep();
        dog.bark();

        Cat cat = new Cat();
        cat.eat();
        cat.sleep();
        cat.meow();


    }
}
