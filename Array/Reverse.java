package Array;
import java.util.*;
public class Reverse {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.toString(reverseArray(arr)));
    }
    public static int[] reverseArray(int[] arr)
    {
        // Reverse the string str
        int left = 0, right = arr.length-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }

        return arr;
    }
}
