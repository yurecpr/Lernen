package Lernen.Massiv;

public class arrays {
    public static void main(String[] args) {

        int[] sample = new int[10];
        sample[1] = 30;
        System.out.println("Element" + sample[1]);
        sample[2] = 45;
        System.out.println("Element" + sample[2]);
        int[] numbers = new int[]{10, 34, 6, 78, 97};
        System.out.println("First:" + numbers[0]);
        System.out.println("End:" + numbers[4]);
        int[] nums = {34, 23, 34, 5, 67, 86};
        System.out.println("First: " + nums[0] + "  " + "End: " + nums[4]);
        System.out.println(nums.length);


    }

}
