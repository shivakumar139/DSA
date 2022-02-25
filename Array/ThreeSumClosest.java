package Array;

import java.util.*;

public class ThreeSumClosest {
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        System.out.println(threeSum(arr,-2));
//        System.out.println(-10>-16);

    }
    static int threeSum(int[] arr, int target){
        int ans = Integer.MIN_VALUE;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int sum = arr[left] + arr[right] + arr[i];
                System.out.println(sum);
                int diff = Math.abs(target - sum);
                if(diff < target){
                    left++;
                    ans = Math.max(sum,ans);
                }
                else {
                    right--;
                }
            }
        }

        return ans;

    }

}
