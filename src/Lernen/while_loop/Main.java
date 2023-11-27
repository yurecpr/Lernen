package Lernen.while_loop;

public class Main {
    public static void main(String[] args) {
        int i = 1;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);
        i++;
        System.out.println(i);

        System.out.println("In while loop");
//        int y = 1;
//        while (y < 6) {
//            if (y % 2 == 0) {
//                System.out.println(y + " Is even");
//
//            } else {
//                System.out.println(y + " Is odd");
//            }
//            y++;
//        }
//        int k = 10;
//        while (k >= 1) {
//            System.out.print(k + " ");
//            k--;
//        }
//        char ch = 'A';
//        while (ch <= 'z') {
//            System.out.print(ch + " ");
//            ch++;
//        }
        System.out.println("Count sum");
        System.out.println(sumNum(10));


    }

    public static int sumNum(int n) {
        int i = 1;
        int sum = 0;

        while (i <= n) {

            sum = sum + i;
            i++;
        }
        return sum;
    }


}
