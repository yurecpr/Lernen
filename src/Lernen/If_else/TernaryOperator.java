package Lernen.If_else;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 18;

//        if (age >= 18) {
//            System.out.println("Du kanst wahlen");
//        } else{
//            System.out.println("You can not vote");}


        boolean isAdult = age >= 18 ? true : false;
        System.out.println("can vote?" + isAdult);

        String isAdultString = age >= 18 ? "Yes" : "No";

        int num1 = 15;
        int num2 = 30;

        int max = num1 >= num2 ? num1 : num2;
        System.out.println(max);

        int abs = num2 > 0 ? num2 : -num2;
        System.out.println(abs);
    }
}
