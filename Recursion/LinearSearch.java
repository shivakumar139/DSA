package Recursion;

import java.util.ArrayList;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,4,6};
//        System.out.println(search(arr,6));
//        System.out.println(searchIndex(arr,6,0));
//        ArrayList<Integer> list = new ArrayList<>();
//        System.out.println(searchAllIndex(arr,6, 0,list));
        System.out.println(searchAllIndex2(arr,3, 0));

    }
    static ArrayList searchAllIndex2(int[] arr, int key, int index){
        ArrayList<Integer> list = new ArrayList<>();
        if(index == arr.length){
            return list;
        }

        if(arr[index] == key){
            list.add(index);
        }

        list.addAll(searchAllIndex2(arr, key, index+1));
        return list;
    }

    private static ArrayList searchAllIndex(int[] arr, int key, int index, ArrayList<Integer> list) {
        if(index == arr.length)
            return list;
        if(arr[index] == key)
            list.add(index);

        return searchAllIndex(arr, key, index+1, list);

    }

    private static int searchIndex(int[] arr, int key,int index) {
        if(index == arr.length)
            return -1;
        if(arr[index] == key)
            return index;
        else
            return searchIndex(arr, key, index+1);
    }

    static boolean search(int[] arr, int key){
        return helper(arr,key,0);
    }

    static boolean helper(int[] arr, int key, int index){
        if(index == arr.length)
            return false;
        return arr[index] == key || helper(arr,key,index+1);
    }
}
