package Sorting;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {1,2,-3,-4,-5,0};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int last = arr.length-i-1;
            int maxIndex = 0;

            for(int j=1;j<=last;j++){
                if(arr[maxIndex] < arr[j]){
                    maxIndex = j;
                }
            }

            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
