package Recursion;

public class PalindromicString {
    static int ans = 0;
    public static void main(String[] args) {
        System.out.println(countSubstrings("abc"));

    }
    static int countSubstrings(String s) {
        helper("",s);
        return ans;
    }

    private static void helper(String p, String up) {
        if(up.isEmpty()){
            String rev = reverse(p);
            System.out.println("rev -> " + rev + " p -> " + p);
            if(rev.equals(p) && !p.isEmpty())
                ans++;

            return;
        }

        //include call
        helper(p+up.charAt(0), up.substring(1));
        helper(p, up.substring(1));
    }

    private static String reverse(String p) {
        char[] ch = p.toCharArray();
        int left = 0, right = ch.length-1;
        while(left < right){
            char temp = ch[left];
            ch[left] = ch[right];
            ch[right] = temp;
            left++;
            right--;
        }

//        System.out.println("ch - >" + String.valueOf(ch));
        return String.valueOf(ch);
    }
}
