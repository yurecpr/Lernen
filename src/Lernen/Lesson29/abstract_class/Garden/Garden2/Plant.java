package Lernen.Lesson29.abstract_class.Garden.Garden2;

abstract class Plant {
    protected String name;
    protected int height;
    protected int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }


    abstract void doSpring();

    abstract void doSummer();

    abstract void doAutumn();

    abstract void doWinter();

    // Метод для вывода информации о растении
    public String toString() {
        return "Name: " + name + ", Height: " + height + ", Age: " + age;
    }
}