package Recursion;

public class RemoveA {
    public static void main(String[] args) {
        String str = "bcaappleappl";
        System.out.println(skipString(str));
    }

    private static String removeA(String str) {
       if(str.isEmpty())
           return "";

       String ans = "";
       if(str.charAt(0) != 'a'){
           ans += str.charAt(0);
       }
       ans += removeA(str.substring(1));

       return ans;
    }

    private static String skipString(String str){
//        replace aa
        if(str.isEmpty()){
            return "";
        }
        String ans = "";
        if(str.startsWith("app") && !str.startsWith("apple")){
            return skipString(str.substring(3));
        } else{
            ans += str.charAt(0);
            return ans + skipString(str.substring(1));
        }

    }

}
