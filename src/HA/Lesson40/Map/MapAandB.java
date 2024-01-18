package HA.Lesson40.Map;

import java.util.HashMap;
import java.util.Map;

public class MapAandB {

    public static Map<String, String> mapAB(Map<String, String> inputMap) {

        Map<String, String> resultMap = new HashMap<>(inputMap);


        if (inputMap.containsKey("a") && inputMap.containsKey("b")) {

            String valueA = inputMap.get("a");
            String valueB = inputMap.get("b");

            resultMap.put("ab", valueA + valueB);
        }


        return resultMap;
    }


}