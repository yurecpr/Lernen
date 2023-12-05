package HA.Lesson19;

public class Temperature {
    public static void main(String[] args) {

        Temperature a = new Temperature(150);
        Temperature b = new Temperature(100);
        System.out.println(a.far + "°F= " + a.transform() + "°C");
        System.out.println(b.far + "°F= " + b.transform() + "°C");

    }

    int cells;
    int far;

    public Temperature(int far) {
        this.far = far;
    }

    int transform() {
        return cells = (5 * (far - 32) / 9);
    }
}

