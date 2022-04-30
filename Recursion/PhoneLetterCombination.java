package Recursion;

import java.util.ArrayList;
import java.util.List;

public class PhoneLetterCombination {
    static String[] arr = {"","","abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    public static void main(String[] args) {
        String str = "23";
        combinations("", str);

        System.out.println();
        System.out.println(combinationsList("", str));
    }

    public static void combinations(String p, String up){
        if(up.isEmpty()){
            System.out.print(p + " ");
            return;
        }


        int number = up.charAt(0) - '0';
        String value = arr[number];

        for (int i = 0; i < value.length(); i++) {
            combinations(p + value.charAt(i), up.substring(1));
        }
    }


    public static List<String> combinationsList(String p, String up){
        if(up.isEmpty()){
            List<String> li = new ArrayList<>();
            li.add(p);
            return li;
        }


        List<String> allAns = new ArrayList<>();
        int number = up.charAt(0) - '0';
        String value = arr[number];

        for (int i = 0; i < value.length(); i++) {
            allAns.addAll(combinationsList(p + value.charAt(i), up.substring(1)));
        }

        return allAns;
    }
}


