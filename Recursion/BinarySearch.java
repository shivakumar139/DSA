package Recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr,3,0,arr.length-1));
    }

    static int binarySearch(int[] arr, int key, int start, int end){
        if(start > end)
            return -1;

        int mid = start + (end - start)/2;
        if(arr[mid] == key)
            return mid;

        if(arr[mid] < key)
            return binarySearch(arr, key, mid+1, end);
        else{
            return binarySearch(arr, key, start, mid-1);
        }
    }
}
