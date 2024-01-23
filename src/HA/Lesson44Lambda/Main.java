package HA.Lesson44Lambda;

public class Main {
    public static void main(String[] args) {

        Printable printableLambda = s -> System.out.println("!" + s + "!");
        printableLambda.print("etwas");


        Producable producableLambda = () -> "Hello World";
        System.out.println(producableLambda.produce());
    }

    interface Printable {
        void print(String s);
    }

    interface Producable {
        String produce();
    }


}
