package Lernen.OOP;

public class Person {
    String name;
    int age;
    int height;

    public Person() {
        name = "No name";
        age = 0;
    }


    public Person(String personsName, int personsAge, int personHeight) {
        name = personsName;
        age = personsAge;
        height = personHeight;

    }

    public void canWalk() {
        System.out.println(name + " can walk");

    }

    public void myName() {
        System.out.println("My name is " + name);
    }

}
