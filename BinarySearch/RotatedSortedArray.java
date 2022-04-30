package BinarySearch;

import java.util.Collections;

// https://leetcode.com/problems/search-in-rotated-sorted-array/
public class RotatedSortedArray {
    public static void main(String[] args) {
        int[] arr = {4,5};
        int peakIndex = getPeakIndex(arr);
//        System.out.println(peakIndex);
        int ans = binarySearch(arr,0,peakIndex-1,5);

        if(ans >= 0)
            System.out.println(ans);
        else{
            ans = binarySearch(arr,peakIndex, arr.length-1,5);
        }

        System.out.println(ans);
    }

    public static int binarySearch(int[] arr, int start, int end,int target){
        int mid;

        while(start <= end){
            mid = start + (end - start) /2;
            if(arr[mid] == target){
                return mid;
            } else if(arr[mid] > target){
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return -1;

    }
    public static int getPeakIndex(int[] arr){
        int start = 0, end = arr.length-1, mid;

        int endElement = arr[end];

        while(start <= end){
            mid = start + (end - start) /2;
            if(arr[mid] > endElement){
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return start;
    }
}
