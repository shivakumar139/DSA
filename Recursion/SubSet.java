package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
//        subSets(arr,new ArrayList<Integer>(),0);
        permutations(arr,0);
    }

    static void permutations(int[] arr, int index){
        if(index == arr.length-1){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i=index; i< arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            permutations(arr, index+1);

            temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }

    }
    static void subSets(int[] input,ArrayList<Integer> li, int index) {
        if(index >= input.length){
            System.out.println(li);

            return;
        }


        //        include call
        li.add(input[index]);
        subSets(input, li, index+1);
        li.remove(li.size()-1);
//        exclude call
        subSets(input, li, index+1);


    }
}

 
