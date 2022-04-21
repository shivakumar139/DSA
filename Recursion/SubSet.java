package Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class SubSet {
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subSets(arr,new ArrayList<Integer>(),0);
    }

    private static void subSets(int[] input,ArrayList<Integer> li, int index) {
        if(index >= input.length){
            System.out.println(li);
            li.clear();
            return;
        }

//        exclude call
        subSets(input, li, index+1);
//        include call
        li.add(input[index]);
        subSets(input, li, index+1);

    }
}

 
