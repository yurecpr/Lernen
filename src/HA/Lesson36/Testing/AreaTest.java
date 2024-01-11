package HA.Lesson36.Testing;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreaTest {
    @Test
    void testCalculateTotalArea() {

        Circle circle = new Circle(5.0);
        Square square = new Square(4.0);

        Shape[] shapes = {circle, square};


        double totalArea = Main.calculateTotalArea(shapes);


        assertEquals(circle.calculateArea() + square.calculateArea(), totalArea);
    }


}


