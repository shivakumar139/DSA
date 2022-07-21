package Array;

import java.util.Arrays;

public class TrappingRainWater {
    public static void main(String[] args) {
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println(trappingWater(arr));
    }

    private static int trappingWater(int[] height) {

        int[] rightMax = new int[height.length];
        int max = 0;
        for(int i = height.length-1; i>=0; i--){
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }
        System.out.println(Arrays.toString(rightMax));

        int sum = 0;
        int leftMax = 0;
        for (int i = 0; i < height.length; i++) {

            leftMax = Math.max(leftMax, height[i]);
            // find left most max value
            // find the right most max value

            sum = sum +  Math.min(leftMax, rightMax[i]) - height[i];

        }

        return sum;
    }
}
