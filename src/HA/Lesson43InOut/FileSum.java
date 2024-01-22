package HA.Lesson43InOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileSum {
    public static void main(String[] args) {

        String filePath = "input.txt";
        int result = sumFromFile(filePath);
        System.out.println("Summ: " + result);
    }

    public static int sumFromFile(String filePath) {
        int sum = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                sum += Integer.parseInt(line);
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return sum;
    }


}
