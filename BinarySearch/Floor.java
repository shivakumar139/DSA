package BinarySearch;

public class Floor {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(floor(arr, 1));
    }

    public static int floor(int[] arr, int target){
        int ans = -1, mid;
        int start = 0, end = arr.length - 1;

        while(start <= end){
            mid = start + (end - start) / 2;

            if(arr[mid] <= target){
                ans = arr[mid];
                start = mid + 1;
            } else{
                end = mid - 1;
            }
        }

        return ans;
    }
}
