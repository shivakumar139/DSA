package Array;

import java.util.*;

public class ThreeSum{
    public static void main(String[] args) {
        int[] arr = {-1,2,1,-4};
        Set<Integer> set = new HashSet<>();
        System.out.println(threeSum(arr));

    }
    static List<List<Integer>> threeSum(int[] arr){
        Set<List<Integer>> set = new HashSet<>();
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            int left = i+1;
            int right = arr.length-1;

            while(left < right){
                int sum = arr[left] + arr[right];

                if(sum == -arr[i]){
                    set.add(Arrays.asList(arr[i],arr[left++],arr[right--]));
                } else if(sum < -arr[i]){
                    left++;
                } else{
                    right--;
                }
            }
        }
        return new ArrayList<>(set);

    }



}
