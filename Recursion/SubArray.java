package Recursion;

import java.util.ArrayList;
import java.util.List;

public class SubArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        System.out.println(subSetDuplicate(arr));
        System.out.println(subSet(arr));
    }

    private static List<List<Integer>> subSet(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            for (int i = 0; i < n; i++) {
                List<Integer> internal = new ArrayList<>(outer.get(i));
                internal.add(num);
                outer.add(internal);
            }
        }

        return outer;

    }
    private static List<List<Integer>> subSetDuplicate(int[] arr) {
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();
            List<Integer> search = new ArrayList<>();
            search.add(num);
            if(!outer.contains(search)){
                for (int i = 0; i < n; i++) {
                    List<Integer> internal = new ArrayList<>(outer.get(i));
                    internal.add(num);
                    outer.add(internal);
                }
            }
        }

        return outer;

    }
}
