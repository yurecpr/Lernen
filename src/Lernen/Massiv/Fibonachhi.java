package Lernen.Massiv;

public class Fibonachhi {
    public static void main(String[] args) {

//        System.out.println(fibonacci(0));
//        System.out.println(fibonacci(1));
//        System.out.println(fibonacci(2));
//        System.out.println(fibonacci(3));
//        System.out.println(fibonacci(4));
        System.out.println(fibonacci(5));
//        System.out.println(fibonacci(6));
//        System.out.println(fibonacci(7));
//        System.out.println(fibonacci(8));
//        System.out.println(fibonacci(9));
//        System.out.println(fibonacci(15));
//        System.out.println(fibonacci(30));


    }

    public static int fibonacci(int n) {
        if (n < 2)
            return n;

        int fib1 = 0;
        int fib2 = 1;
        int fNew = 0;

        for (int i = 2; i <= n; i++) {
            fNew = fib1 + fib2;
            fib1 = fib2;
            fib2 = fNew;
           

        }
        return fNew;
    }
}
