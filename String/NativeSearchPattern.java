package String;

import java.util.Scanner;

public class NativeSearchPattern {
    public static void main(String[] args) {
        String str = "aaabaaaabaaabaaaabaaaabaaaabaaaaba";
//        aaaba aaaba aaaba aaaba aaaba aaaba
        String search = "aaaba";
        Scanner sc = new Scanner(System.in);

        System.out.println(Search(str,search));

    }
    static int Search(String str, String search){
//        StringBuilder sb = new StringBuilder(str);

        int count = 0;
        int len = search.length();
        int i=0;
        while(i+len <= str.length()) {
            if(search.equals(str.substring(i,i+len))){
                count++;
                i+=len;
            } else{
                i++;
            }

        }

        return count;
    }
}
