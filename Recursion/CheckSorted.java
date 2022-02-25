package Recursion;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6};
        System.out.println(check(arr));
    }
    static boolean check(int[] arr){
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int i) {
        if(i == arr.length-1)
            return true;
        return arr[i] < arr[i+1] && helper(arr,i+1);
    }
}
