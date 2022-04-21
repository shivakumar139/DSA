package Recursion;

public class ReverseStr {
    public static void main(String[] args) {
        String str = "shiva";
//        reverse(str,0);
//        System.out.println(reverseString(str,0));
        System.out.println(isPalindrome("aba"));
    }

    private static String reverseString(String str, int index) {
        if(index >= str.length()){
            return "";
        }
        String ans = reverseString(str, index+1);
        return ans + str.charAt(index);
    }

    static void reverse(String str, int index){
        if(index >= str.length())
            return;

        reverse(str, index+1);
        System.out.print(str.charAt(index));
    }
    static boolean isPalindrome(String str){
        return str.equals(reverseString(str,0))?true:false;
    }
}
