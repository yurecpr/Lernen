package Lernen.our_switch;

import java.util.Scanner;

public class Helper {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Our Help System. To see the info enter menu number");
        System.out.println("   1. if");
        System.out.println("   2. switch ");

        int choice = scan.nextInt();

        System.out.println("\n");

        switch (choice) {

            case 1:
                System.out.println("IF:");
                System.out.println("if (condition) \n {statements}");
                System.out.println("else \n {statement}");
                break;

            case 2:
                System.out.println("SWITCH:");
                System.out.println("switch(statements) {");
                System.out.println("case constant:");
                System.out.println("statements");
                System.out.println("break;");
                System.out.println("  ......");
                System.out.println("default");
                System.out.println("   statements");
                System.out.println("}");
                break;

            default:
                System.out.println("False choice. Please enter 1 or 2");
        }
    }

}
