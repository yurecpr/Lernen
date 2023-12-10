package Lernen.Class;

public class Katzen {

    String name;
    int age;

    public Katzen(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public static void main(String[] args) {

        Katzen barsik = new Katzen("Барсик", 5);
        System.out.println(barsik.name);
        System.out.println(barsik.age);
    }

}
