package Recursion;

public class MinMax {
    public static void main(String[] args) {
        int[] arr = {1,-3,0,55,2};
        System.out.println(findMin(arr,0));

    }

    private static int findMin(int[] arr, int index) {
        if(index == arr.length-1)
            return arr[index];

        return Math.min(arr[index], findMin(arr, index+1));
    }
}
