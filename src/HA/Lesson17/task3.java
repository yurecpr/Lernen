package HA.Lesson17;

public class task3 {
    public static void main(String[] args) {
        String java = "HelloJava";
        System.out.println(java.substring(1, 4));
        System.out.println(ourSubstring(java, 1, 4));

    }

    public static String ourSubstring(String str, int begin, int end) {
        String res = "";

        for (int i = begin; i < str.length() && i < end; i++) {
            res = res + str.charAt(i);
        }
        return res;
    }
}
