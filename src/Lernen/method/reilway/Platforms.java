package Lernen.method.reilway;

import java.util.Arrays;

public class Platforms {
    public static void main(String[] args) {
        Platforms p = new Platforms();
        int[] arrival = {100, 140, 150, 200, 215, 400};
        int[] departure = {110, 300, 220, 230, 315, 600};

        p.findNumberPlatforms(arrival, departure);
        System.out.println(p.findNumberPlatforms(arrival, departure));

    }
    //time arr/dep     platform

    public int findNumberPlatforms(int arr[], int dep[]) {
        Arrays.sort(arr);
        Arrays.sort(dep);

        int platformsCurrent = 0;
        int platfprmsMax = 0;
        int i = 0, j = 0;
        while (i < arr.length && j < dep.length) {
            if (arr[i] < dep[j]) {
                platformsCurrent++;
                i++;
                if (platformsCurrent > platfprmsMax)
                    platfprmsMax = platformsCurrent;
            } else {
                platformsCurrent--;
                j++;
            }
        }
        return platformsCurrent;

    }
}
