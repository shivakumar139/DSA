package ListClass;

import java.util.ArrayList;
import java.util.List;

public class TwoDList {
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        printList(threeSum(arr));
    }
    static void printList(List<List<Integer>> li){
        for(List a:li){
            System.out.println(a.toString());
        }
    }

    static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> li = new ArrayList<>();
        int listIndex = 0;

        for (int i = 0; i < nums.length; i++) {
            for(int j=i+1; j<nums.length;j++){
                for(int k = j+1;k< nums.length;k++){
                    int sum = nums[i]+nums[j]+nums[k];
                    List<Integer> a = new ArrayList<>();
                    a.add(nums[i]);
                    a.add(nums[j]);
                    a.add(nums[k]);
                    if(sum == 0){
                        li.add(new ArrayList<>());
                        li.get(listIndex).add(nums[i]);
                        li.get(listIndex).add(nums[j]);
                        li.get(listIndex).add(nums[k]);
                        listIndex++;
                        System.out.println(li.get(0).containsAll(a));
                    }
                }
            }
        }

        return li;
    }
}
