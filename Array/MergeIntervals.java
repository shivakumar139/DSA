package Array;

import java.util.Arrays;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = {{1,3},{2,6},{8,10},{15,18}};
        int[][] ans = merge(arr);
//        System.out.println(Arrays.toString(merge(arr)));

        for(int[] row: ans){
            System.out.println(Arrays.toString(row));
        }
    }

    static public int[][] merge(int[][] intervals) {
        int[][] ans = new int[intervals.length][2];
        int ansIndex = 0;
        for (int i = 0; i < intervals.length-1; i++) {
            if(intervals[i+1][0] <= intervals[i][1]){
                ans[ansIndex][0] = intervals[i][0];
                ans[ansIndex][1] = intervals[i+1][1];
                ansIndex++;
                i++;
            } else{
                ans[ansIndex][0] = intervals[i][0];
                ans[ansIndex][1] = intervals[i][1];
                ansIndex++;
            }
        }

        return  ans;

    }
}
