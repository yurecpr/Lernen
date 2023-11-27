package HA;


import java.util.Scanner;

public class Lesson7_1 {
    public static void main(String[] args) {

        double num1, num2, result;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.println("Enter second number: ");
        num2 = scanner.nextDouble();

        System.out.println("Operation: ");
        char operator = scanner.next().charAt(0);

        switch (operator) {

            case '+':
                result = num1 + num2;
                System.out.println(num1 + "+" + num2 + "=" + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println(num1 + "-" + num2 + "=" + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println(num1 + "*" + num2 + "=" + result);
                break;

            case '/':
                result = num1 / num2;
                System.out.println(num1 + "/" + num2 + "=" + result);
                break;

            default:
                System.out.println("Incorrect input!!!");
        }


    }
}
