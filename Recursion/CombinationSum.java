package Recursion;

import java.util.*;

public class CombinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        System.out.println(combinationSum(candidates, target));

    }
    static List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        helper(new ArrayList<Integer>(), candidates, target, ans, 0);

        return ans;
    }

    static void helper(List p, int[] candidates, int up, List<List<Integer>> ans, int index){
        if(up == 0){
            ans.add(new ArrayList<>(p));
            return;
        }

        if(up < 0){
            return;
        }

        for(int i=index; i<candidates.length; i++){
            p.add(candidates[i]);
            helper(p, candidates, up-candidates[i], ans, i);
            p.remove(p.size()-1);
        }
    }
}
