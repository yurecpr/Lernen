package Lernen.Massiv;

public class strigCounter {
    public static void main(String[] args) {
        String[] string = {
                "Hello world!",
                "Hello Java world!",
                "Jack",
                "hello John",
                "That´s it!"
        };
        counterString(string, 4);
    }

    public static void counterString(String[] array, int length) {
        for (String str : array) {
            if (str.length() == length)
                System.out.println(str);
        }
    }

}
