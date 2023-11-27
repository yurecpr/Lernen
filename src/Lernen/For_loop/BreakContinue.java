package Lernen.For_loop;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 6) {
                continue;

            }


            System.out.println(i);
        }
        int j = 0;
        while (j < 10) {
            if (j == 6) {
                j++;
                continue;

            }
            System.out.println("j:" + j);
            j++;


        }

    }
}
