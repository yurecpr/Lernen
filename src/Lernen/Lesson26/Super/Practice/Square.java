package Lernen.Lesson26.Super.Practice;

public class Square extends Form {
    double length;


    Square(double length) {
        this.length = length;

    }

    @Override
    double calculateArea() {
        return length * length;
    }

    public String toString() {
        return "Area of Square= ";
    }
}

