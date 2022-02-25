package Recursion;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-1,-2,-3};
        bubbleSort(arr,0);
        System.out.println(Arrays.toString(arr));
    }
    static void bubbleSort(int[] arr,int index){
        if(index == arr.length-1 || arr[index] < arr[index+1])
            return;

        if(arr[index] > arr[index+1]) {
            int temp = arr[index];
            arr[index] = arr[index + 1];
            arr[index + 1] = temp;
            bubbleSort(arr, index + 1);
        }
        bubbleSort(arr, 0);
    }
}
