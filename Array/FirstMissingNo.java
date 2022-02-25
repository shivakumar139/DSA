package Array;

import java.util.Arrays;

public class FirstMissingNo {
    public static void main(String[] args) {
        int[] arr = {1,2,0};
       
//        System.out.println(missingNumber(arr));
        {
            System.out.println(firstMissingPositive(arr));
        }
    }

    static int firstMissingPositive(int[] arr) {
        int i = 0;
        while(i<arr.length){
            int correct = arr[i];
            if(arr[i]>=arr.length || arr[i] == arr[correct] || arr[i]<0)
                i++;
            else
                swap(arr,i,correct);
        }

        for(i=1;i<arr.length;i++){
            if(i!=arr[i]){
                return i;
            }
        }
        return arr.length;
    }






//    cyclic sort
    static int cyclicMissingNo(int[] arr){
        int ans = -1;
        int i = 0;
        while(i<arr.length){
            if(arr[i] >= arr.length || i == arr[i] || arr[i] < 0)
                i++;
            else
                swap(arr,i,arr[i]);
        }
        System.out.println(Arrays.toString(arr));

        for(i=1;i<arr.length;i++){
            if(i!=arr[i]){
                ans = i;
                break;
            }
        }
        return ans==-1?arr.length:ans;
    }
    static void swap(int[] arr, int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
    static int missingNumber(int[] arr){
        int ans = -1;
        for(int i=0;i< arr.length;i++){
            if(Math.abs(arr[i]) < arr.length){
                arr[Math.abs(arr[i])] = -arr[Math.abs(arr[i])];
            }
        }

        for(int i=0; i< arr.length; i++){
            if(arr[i] > 0){
                ans = i;
                break;
            }
        }
        return ans==-1?arr.length:ans;
    }



}
