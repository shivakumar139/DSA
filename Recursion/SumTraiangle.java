package Recursion;

import java.util.Arrays;

public class SumTraiangle {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        sumTriangle(arr);

    }

    public static void sumTriangle(int[] arr){
        if(arr.length <= 0){
            return;
        }

        int[] sum = new int[arr.length-1];

        for (int i = 0; i < arr.length - 1; i++) {
            sum[i] = arr[i] + arr[i+1];
        }

        sumTriangle(sum);

        System.out.println(Arrays.toString(arr));

    }
}
