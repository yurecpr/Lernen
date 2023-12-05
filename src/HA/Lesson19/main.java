package HA.Lesson19;

public class main {
    public static void main(String[] args) {

        Temperature a = new Temperature(150);
        Temperature b = new Temperature(100);
        System.out.println(a.far + "°F= " + a.transform() + "°C");
        System.out.println(b.far + "°F= " + b.transform() + "°C");

    }
}
