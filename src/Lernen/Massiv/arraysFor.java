package Lernen.Massiv;

public class arraysFor {
    public static void main(String[] args) {
        System.out.println("Arrey nums in loop");
        int[] nums = new int[]{23, 24, 57, 867, 3, 6, 99};
        for (int i = 0; i < nums.length; i++) {
            System.out.println("nums[" + i + "] = " + nums[i]);

        }
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            ints[i] = i;
        }
        for (int i = 0; i < ints.length; i++) {
            System.out.println("Ints[" + i + "] = " + ints[i]);
        }
    }
}
