package Lernen.while_loop;

import java.util.Scanner;

public class DuWhile1 {
    public static void main(String[] args) {
//        int i = 0;
//        do {
//            System.out.println(i);
//            i--;
//        } while (i > 1);
        example();
    }

    static void example() {

        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter a letter / q to qiut");
            ch = scanner.next().charAt(0);
            System.out.println("You have entered " + ch);

        } while (ch != 'q');

    }

}
