package Array;
import java.util.Arrays;
public class RotateArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(rotate(arr,3)));
    }
    static public int[] rotate(int[] nums, int k) {

        int[] arr = new int[nums.length];
        int j=0;
        for(int i=k+1;i<nums.length;i++){
            arr[j++] = nums[i];
        }

        for(int i=0;i<k+1;i++){
            arr[j++] = nums[i];
        }
        return arr;
    }
}
