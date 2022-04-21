package Array;

//import java.sql.Array;
import java.util.Arrays;
import java.util.HashMap;
//import java.util.HashSet;?

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,2,7,11,15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
//        twoSum(arr,target);
    }
    static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> set = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            set.put(nums[i],i);
        }

        for(int i=0;i< nums.length;i++) {
            int diff = target - nums[i];
            if (set.containsKey(diff) && set.get(diff)!=i) {
                return new int[]{i,set.get(diff)};


            }
        }
        return new int[]{-1,-1};
    }
}
