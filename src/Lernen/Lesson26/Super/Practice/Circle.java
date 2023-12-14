package Lernen.Lesson26.Super.Practice;

class Circle extends Form {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        return "Area of circle= ";
    }
}
