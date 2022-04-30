package BinarySearch;

public class Ceiling {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceil(arr, 23));
    }

    public static int ceil(int[] arr, int target){
        int ans = -1,mid;
        int start = 0, end = arr.length - 1;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(arr[mid] >= target){
                ans = arr[mid];
                end = mid - 1;
            } else{
                start = mid + 1;
            }
        }

        return ans;
    }
}
