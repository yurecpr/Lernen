package HA.Lesson40.Map;

import java.util.HashMap;
import java.util.Map;

public class MapAandB {

    public static Map<String, String> mapAB(Map<String, String> inputMap) {
        // Создаем новую Map для хранения результата
        Map<String, String> resultMap = new HashMap<>(inputMap);

        // Проверяем наличие ключей 'a' и 'b' в исходной Map
        if (inputMap.containsKey("a") && inputMap.containsKey("b")) {
            // Получаем значения по ключам 'a' и 'b'
            String valueA = inputMap.get("a");
            String valueB = inputMap.get("b");

            // Создаем новый ключ 'ab' с суммой значений от ключей 'a' и 'b'
            resultMap.put("ab", valueA + valueB);
        }

        // Возвращаем результат
        return resultMap;
    }


}