package Lernen.OOP;


public class main {
    public static void main(String[] args) {
        Car volvo = new Car();

        Person person1 = new Person();
        person1.name = "John";
        person1.age = 30;
        person1.canWalk();
        System.out.println(person1.name + "Person's name is " + person1.name);
        System.out.println("He is " + person1.age);

        Person person2 = new Person();
        person2.name = "Kate";
        person2.age = 20;
        System.out.println("Person's name is " + person2.name);
        System.out.println("She is " + person2.age);
        person2.canWalk();

//        System.out.println();
//
//        person3.myName();
//        person3.canWalk();

        System.out.println();
        Person person4 = new Person();
        person4.myName();
        person4.canWalk();

        System.out.println();

        Person person5 = new Person("Bill ", 45, 185);
        person5.myName();
        person5.canWalk();
        System.out.println(person5.name + " Is height           " + person5.height);

        Student mike = new Student();
        mike.name = "Mike";
        mike.age = 23;
        mike.age = 0;
        System.out.println(mike.name + " " + mike.age);

        Student jack = new Student();
        jack.name = "Jack";
        jack.age = 25;
        System.out.println(jack.name + " " + jack.age);

        mike = jack;
        System.out.println(mike.name + " " + mike.age);


    }

}
