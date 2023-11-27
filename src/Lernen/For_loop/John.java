package Lernen.For_loop;

import org.w3c.dom.ls.LSOutput;

public class John {
    public static void main(String[] args) {
        System.out.println(johnInTrouble());

    }

    static boolean johnInTrouble() {
        boolean singin = false;
        int hour = 5;
        return singin && (hour < 7 || hour > 20);
    }


}
