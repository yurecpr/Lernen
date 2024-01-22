package HA.Lesson43InOut;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LongestLine {
    public static void main(String[] args) {

        String filePath = "text1.txt";
        String result = findLongestLine(filePath);
        System.out.println("Am longeste line: " + result);
    }

    public static String findLongestLine(String filePath) {

        String longestLine = "";

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.length() > longestLine.length()) {
                    longestLine = line;
                }
            }
        } catch (IOException e) {
            e.getMessage();
        }

        return longestLine;
    }


}

