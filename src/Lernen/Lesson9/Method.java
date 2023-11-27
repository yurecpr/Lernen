package Lernen.Lesson9;

public class Method {
    public static void main(String[] args) {
        System.out.println(calcArea(15));
    }

    static double calcArea(double radius) {
        double area = Math.PI * radius * radius;
        return Math.round(area);
    }
}
