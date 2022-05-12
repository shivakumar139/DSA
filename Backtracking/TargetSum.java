package Backtracking;

public class TargetSum {
    public static void main(String[] args) {
        int[] arr = {1};
        System.out.println(findTargetSumWays(arr, 1));
    }
    static int findTargetSumWays(int[] nums, int target) {

        return backtrack("",0,target, nums, 0);
    }

    static int backtrack(String ans, int p, int target, int[] nums, int i){
        if(p == target && i == nums.length){
            System.out.println(ans);
            return 1;
        }
        if(i >= nums.length){
            return 0;
        }

        int count = 0;

        //+ call
        count += backtrack(ans + nums[i] + "+",p+nums[i], target, nums, i+1);

        //-call
        count += backtrack(ans + nums[i] + "-", p-nums[i],target, nums, i+1);

        return count;
    }
}
