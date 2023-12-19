package Practic.Pr19_12.Abstrakt;

public class Main {
    public static void main(String[] args) {

        Student[] students = {
                new Girl("Anna", "Smith", 12),
                new Girl("Eva", "Brown", 13),
                new Boy("Vova", "Green", 11),
                new Boy("Ivan", "Black", 12)
        };


        for (Student student : students) {
            System.out.println(student.getInfo());
        }
    }
}