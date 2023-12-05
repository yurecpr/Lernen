package HA.Lesson19;

public class Temperature {

    int cells;
    int far;

    public Temperature(int far) {
        this.far = far;
    }

    int transform() {
        return cells = (5 * (far - 32) / 9);
    }
}

