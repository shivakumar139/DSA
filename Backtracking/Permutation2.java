package Backtracking;
import java.util.*;

public class Permutation2 {
    public static void main(String[] args) {
        int[] arr = {1,2,1};
        System.out.println(permuteUnique(arr));

    }
    static List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        helper(nums, 0, ans);
        return ans;
    }

    static void helper(int[] nums, int index, List<List<Integer>> ans){
        if(index == nums.length-1){
            List<Integer> temp = new ArrayList<>();
            for (int num: nums) { temp.add(num); }
            ans.add(temp);
            return;
        }

        Set<Integer> appeared = new HashSet<>();

        for(int i=index; i<nums.length; i++){
            if (appeared.add(nums[i])){
                swap(nums, index, i);
                helper(nums, index+1, ans);
                swap(nums, index, i);
            }
        }
    }


    static void swap(int[] nums, int i, int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
