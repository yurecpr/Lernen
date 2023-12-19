package Practic.Pr19_12.Abstrakt;

abstract class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }


    abstract String getActivity();


    public String getInfo() {
        return "Name: " + firstName + " " + lastName + ", Age: " + age + ", Activity: " + getActivity();
    }
}