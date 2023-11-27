package HA.Lesson9;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a letter:");
        char letter1 = scanner.next().charAt(0);
        System.out.println(decide(letter1));
    }

    public static String decide(char letter) {
        if (Character.isLetter(letter)) {
            switch (letter) {
                case 'A':
                case 'a':
                case 'E':
                case 'e':
                case 'Y':
                case 'y':
                case 'U':
                case 'u':
                case 'I':
                case 'i':
                case 'O':
                case 'o':
                    return ("The letter " + letter + " is a vowel");

                default:
                    return ("The letter " + letter + " is consonant");
            }
        }
        return ("The Symbol " + letter + " is not a letter");
    }
}
