package HA.Lesson18;

public class Student {
    String name;
    int age;

    public static void main(String[] args) {
        Student st1 = new Student();
        st1.name = "Ivan";
        st1.age = 21;
        System.out.println("Student name: " + st1.name + ", Age: " + st1.age);

        Student st2 = new Student();
        st2.name = "Anna";
        st2.age = 20;
        System.out.println("Student name: " + st2.name + ", Age: " + st2.age);

    }
}

