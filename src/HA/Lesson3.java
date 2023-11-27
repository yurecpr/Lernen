package HA;

import java.util.Scanner;

//lesson 03
public class Lesson3 {
    public static void main(String[] args) {
        double a = 25, b = 3;
        int c = 3;
        System.out.println("Результат деления a/b= " + a / b);
        System.out.println("Результат деления a/b с остатком= " + a % b);
        System.out.println("c в квадрате= " + c * c);
    }

    public static class lesson5 {
        public static void main(String[] args) {
            int a = 0, b = 10;
            //if ((a | b)==10)
            System.out.println((a | b) == 10);
        }
    }

    static class Lesson7_1 {
        public static void main(String[] args) {

            char operator;
            Double number1, number2, result;

            // create an object of Scanner class
            Scanner input = new Scanner(System.in);

            // ask users to enter operator
            System.out.println("Choose an operator: +, -, *, or /");
            operator = input.next().charAt(0);

            // ask users to enter numbers
            System.out.println("Enter first number");
            number1 = input.nextDouble();

            System.out.println("Enter second number");
            number2 = input.nextDouble();

            switch (operator) {

                // performs addition between numbers
                case '+':
                    result = number1 + number2;
                    System.out.println(number1 + " + " + number2 + " = " + result);
                    break;

                // performs subtraction between numbers
                case '-':
                    result = number1 - number2;
                    System.out.println(number1 + " - " + number2 + " = " + result);
                    break;

                // performs multiplication between numbers
                case '*':
                    result = number1 * number2;
                    System.out.println(number1 + " * " + number2 + " = " + result);
                    break;

                // performs division between numbers
                case '/':
                    result = number1 / number2;
                    System.out.println(number1 + " / " + number2 + " = " + result);
                    break;

                default:
                    System.out.println("Invalid operator!");
                    break;
            }

            input.close();
        }
    }
}