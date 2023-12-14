package Lernen.Lesson26.Super.Practice;

public class Rechtangle extends Form {
    double length;
    double width;

    Rechtangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }

    public String toString() {
        return "Area of Rechtangle= ";
    }
}
