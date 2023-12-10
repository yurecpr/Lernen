package Lernen.method.reilway;

import java.util.Arrays;

public class MinPlatforms {

    // Метод для нахождения минимального количества платформ
    public static int findMinPlatforms(int[] arrival, int[] departure) {
        // Сначала сортируем массивы времени прибытия и отправления
        Arrays.sort(arrival);
        Arrays.sort(departure);

        int platformsNeeded = 1; // Начальное количество платформ
        int result = 0;
        int i = 1, j = 0;

        // Проходимся по массивам прибытия и отправления, чтобы найти минимальное количество платформ
        while (i < arrival.length && j < departure.length) {
            if (arrival[i] <= departure[j]) {
                platformsNeeded++;
                i++;
            } else {
                platformsNeeded--;
                j++;
            }
            // Обновляем результат, если необходимо
            if (platformsNeeded > result) {
                result = platformsNeeded;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        // Примеры времени прибытия и отправления поездов
        int[] arrival = {100, 140, 150, 200, 215, 400};
        int[] departure = {110, 300, 220, 230, 315, 600};

        // Вызов метода для нахождения минимального количества платформ
        int minPlatforms = findMinPlatforms(arrival, departure);
        System.out.println("Минимальное количество платформ, необходимых в каждый момент времени: " + minPlatforms);
    }
}
