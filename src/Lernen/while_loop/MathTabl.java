package Lernen.while_loop;

public class MathTabl {

    public static void main(String[] args) {
        printTable();
    }


    static void printTable() {
        int i = 1;
        while (i <= 10) {

            int k = 1;
            while (k <= 10) {
                System.out.println(i + "*" + k + "=" + i * k);
                k++;
            }
            System.out.println("*****************");
            i++;
        }

    }
}
