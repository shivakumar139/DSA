package Array;

public class MinNumber {
    public static void main(String[] args) {
        int[] arr = {1,4,3,2,1,-2};
        System.out.println(minNum(arr));
    }

    private static int minNum(int[] arr) {
        int ans = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            ans = Math.min(ans, arr[i]);
        }

        return ans;
    }
}
