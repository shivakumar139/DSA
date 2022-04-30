package Recursion;

import java.util.Arrays;
import java.util.*;

public class Permutations {
    public static void main(String[] args) {
        permutationString("abc", 0);
//        System.out.println(permutationStringList(new StringBuilder("abc"), 0));
        int[] arr = {1,2,3};
//        permutationArr(arr, 0);

//        List<int[]> li = new ArrayList<>();
//       permutationList(arr, li, 0);
//        System.out.println(li);


    }

    public static void permutationList(int[] arr, List<int[]> li, int index){
        if(index >= arr.length){
//            List<Integer> list = Arrays.asList(arr);
//            li.add(list);
            Collections.addAll(li, arr);
            return;
        }


//        List<List<Integer>> list = new ArrayList<>();
        for(int i = index; i< arr.length; i++){
//            list.add(new ArrayList<>());
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            permutationList(arr, li, index+1);

//            list.addAll(permutationList(arr, index+1));
        }

        return;
    }
    public static void permutationArr(int[] arr, int index){
        if(index >= arr.length){
            System.out.println(Arrays.toString(arr));
            return;
        }

        for(int i = index; i< arr.length; i++){
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;

            permutationArr(arr, index+1);

            temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
    }



//    permutation using string as a input
    public static void permutationString(String str, int index){
        if(index >= str.length()){
            System.out.println(str);
            return;
        }

        for(int i=index; i<str.length(); i++){
            str = swapString(str,index,i);
//            System.out.println(str);
            permutationString(str, index+1);
//            swapString(str, index, i);
        }
    }

    public static String swapString(String str, int i, int j){
        char[] charArray = str.toCharArray();
        char ch = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = ch;

//        return charArray.toString();
        return String.valueOf(charArray);
    }







    public static void permutationStringBuilder(StringBuilder str, int index){
        if(index >= str.length()){
            System.out.println(str);
            return;
        }

        for(int i=index; i<str.length(); i++){
            swap(str,index,i);
            permutationStringBuilder(str, index+1);
            swap(str, index, i);
        }
    }
    public static List<String> permutationStringList(StringBuilder str, int index){
        if(index >= str.length()){
            List<String> li = new ArrayList<>();
            li.add(str.toString());
            return li;
        }

        List<String> list = new ArrayList<>();
        for(int i=index; i<str.length(); i++){
            swap(str,index,i);
            list.addAll(permutationStringList(str, index+1));
            swap(str, index, i);
        }

        return list;
    }

    public static void swap(StringBuilder str, int i, int j){
        char ch = str.charAt(i);
        str.setCharAt(i, str.charAt(j));
        str.setCharAt(j, ch);
    }
}
