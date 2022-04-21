package Recursion;

public class SumRec {
    public static void main(String[] args) {
        int []arr = {1};
        System.out.println(sum(arr,0));
    }

    private static int sum(int[] arr,  int index) {
        if(index >= arr.length)
            return 0;

        return arr[index] + sum(arr, index+1);
    }
}
