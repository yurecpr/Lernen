package HA.Lesson36.Testing;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);


        Shape[] shapes = {circle, square};
        double totalArea = calculateTotalArea(shapes);

        System.out.println("Rectangle:");
        System.out.println("Area: " + square.calculateArea());
        System.out.println("Perimetr: " + square.calculatePerimeter());
        System.out.println();
        System.out.println("Circle:");
        System.out.printf("Area: " + "%10.2f %n", circle.calculateArea());
        System.out.printf("Perimetr: " + "%10.2f %n", circle.calculatePerimeter());
        System.out.println();
        System.out.printf("Total Area of all shapes: " + "%10.2f %n", calculateTotalArea(shapes));
    }


    static double calculateTotalArea(Shape[] shapes) {
        double totalArea = 0.0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }
}