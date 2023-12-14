package Lernen.Lesson26.Super.Practice;

public class Main {
    public static void main(String[] args) {

        Form circle = new Circle(3.2);
        Form rectangle = new Rechtangle(4.0, 6.0);
        Form square = new Square(7.0);

        Form[] forms = {circle, rectangle, square};

        for (Form form : forms) {
            System.out.println(form.toString() + form.calculateArea());

        }
    }
}
