package Sorting;

import java.util.Arrays;

public class CycleSort {
    public static void main(String[] args) {
        int[] arr = {4,3,2,1,5,6};
        cycleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void cycleSort(int[] arr){
        int i=0;
        while(i<arr.length-1){
            if(i+1 == arr[i])
                i++;
            else
                swap(arr,i,arr[i]-1);
        }
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
