package Lernen.method.Static;


public class Main {
    //Static Java

    public static void main(String[] args) {
        Person person1 = new Person("John", 35);
        Person person2 = new Person("Kate", 23);
        System.out.println("The number of person is : " + Person.counter);

        person1.canTalk();
        Person.sum();
    }
}
