package Array;

import java.util.Arrays;

public class MinumumAverageDiff {
    public static void main(String[] args) {
        int[] arr = {2,5,3,9,5,3};
        System.out.println(average(arr));
    }
    public static int average(int[] arr){
        int sum2 = 0;
        for(int item: arr){
            sum2+=item;
        }

        int sum1 = 0;
        int[] ans = new int[arr.length];
        int k = arr.length-1;

        for (int i = 1; i <= arr.length; i++) {
            sum1 = (sum1 + arr[i-1]) / i;
            if(k>0)
                sum2 = (sum2 - sum1) / k--;

            ans[i-1] =  sum1 - sum2;
        }

        int minAns = Integer.MAX_VALUE;
        int index = -1;
        for(int i=0; i<ans.length; i++){
            if(ans[i] < minAns){
                index = i;
            }
        }

        System.out.println(Arrays.toString(ans));
        return index;
    }
}
