package HA.Lesson36.Testing;

class Square implements Shape {
    private double length;
    private double width;

    public Square(double length) {
        this.length = length;

    }

    @Override
    public double calculateArea() {
        return length * 2;
    }

    @Override
    public double calculatePerimeter() {
        return 4 * length;
    }
}