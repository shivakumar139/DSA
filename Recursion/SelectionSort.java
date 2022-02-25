package Recursion;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,0,-1,-2,-3,5};
        selectionSortRec(arr, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    private static void selectionSortRec(int[] arr, int last) {
        if(last == -1)
            return;

        int maxIndex = 0;
        for (int i = 0; i <= last; i++) {
            if(arr[maxIndex] < arr[i])
                maxIndex = i;
        }
        swap(arr, maxIndex, last);
        selectionSortRec(arr, last-1);
    }

    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static void selectionSort(int[] arr){
        int last = arr.length-1;
        int maxIndex;
        int j=0;
        while(j<last){
            maxIndex = 0;
            for (int i = 0; i <= last; i++) {
                if(arr[maxIndex] < arr[i])
                    maxIndex = i;
            }

            int temp = arr[last];
            arr[last] = arr[maxIndex];
            arr[maxIndex] = temp;
            last--;
            j++;

        }
    }
}
