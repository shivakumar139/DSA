package BinarySearch;

public class MountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2};
        System.out.println(peakElement(arr));
    }

    public static int peakElement(int[] arr){
        int start = 0, end = arr.length - 1, mid;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(arr[mid] > arr[mid + 1]){
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }

        return start;
    }
}
