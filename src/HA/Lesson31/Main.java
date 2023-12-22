package HA.Lesson31;

public class Main {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(5, 10);
        Circle circle = new Circle(7);

        System.out.println("Rectangle:");
        System.out.println("Area: " + rectangle.calculateArea());
        System.out.println("Perimetr: " + rectangle.calculatePerimeter());
        System.out.println();
        System.out.println("Circle:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Perimetr: " + circle.calculatePerimeter());


    }
}
