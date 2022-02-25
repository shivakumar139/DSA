package Array;

public class Kadane {
    public static void main(String[] args) {
//        int[] arr = {4,3,-2,6,-14,7,-1,4,5,7,-10,2,9,-10,-3,-9,6,1};
        int[] arr = {1,2,3,-2,5};
        System.out.println(maxSum(arr));

    }

    static int maxSum(int[] arr){
        int currSum = 0, ans = Integer.MIN_VALUE;
        int left = 0,right=0;
        for(int i=0;i<arr.length;i++){

            currSum+=arr[i];
            ans = Math.max(ans,currSum);
            if(currSum<0) {
                currSum = 0;
                left = i+1;
            }
            if(currSum>=ans)
                right=i;
        }
        System.out.println("Left: "+left+" Right: "+right);

        return ans;
    }
}
