package HA.Lesson40.Map;

import org.junit.Test;

import static org.junit.Assert.*;

import java.util.HashMap;
import java.util.Map;

public class MapABTest {

    @Test
    public void testMapAB() {

        Map<String, String> example1 = new HashMap<>();
        example1.put("a", "Hi");
        example1.put("b", "There");

        Map<String, String> result1 = MapAandB.mapAB(example1);

        assertEquals("HiThere", result1.get("ab"));
        assertEquals("Hi", result1.get("a"));
        assertEquals("There", result1.get("b"));


    }
}
