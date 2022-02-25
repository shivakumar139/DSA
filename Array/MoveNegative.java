package Array;
import java.util.*;
public class MoveNegative {
    public static void main(String[] args) {
        int[] arr = { -1, 2, -3, 4, 5, 6, -7, 8, 9 };
        System.out.println(Arrays.toString(moveNegative(arr)));
    }
    static int[] moveNegative(int[] arr){
        int left = 0, right = arr.length-1;

        while(left<right){
            while(arr[left]<0) left++;

            while(arr[right]>0) right--;

            if(left<right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
            }


        }

        return arr;
    }
}
