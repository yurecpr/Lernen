package HA.Lesson40.Map;

import java.util.HashMap;
import java.util.Map;

import static HA.Lesson40.Map.MapAandB.mapAB;

public class Main {
    public static void main(String[] args) {

        Map<String, String> example1 = new HashMap<>();
        example1.put("a", "Hi");
        example1.put("b", "There");
        System.out.println(mapAB(example1));

        Map<String, String> example2 = new HashMap<>();
        example2.put("a", "Hi");
        System.out.println(mapAB(example2));

        Map<String, String> example3 = new HashMap<>();
        example3.put("b", "There");
        System.out.println(mapAB(example3));
    }
}
