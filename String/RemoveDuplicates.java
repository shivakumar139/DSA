package String;

import java.util.HashSet;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String str = "aabbcc";
        System.out.println(removeDuplicates(str));
    }

    private static String removeDuplicates(String str) {
        String ans = "";
        HashSet<Character> set = new HashSet<>();
        for(int i=0; i<str.length(); i++){
            if(!set.contains(str.charAt(i))){
                ans += str.charAt(i);
                set.add(str.charAt(i));
            }
        }

        return ans;
    }
}
