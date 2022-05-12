package Backtracking;

public class KthBithInBinaryString {
    public static void main(String[] args) {
        System.out.println(findKthBit(20, 1048575));

    }

    static char findKthBit(int n, int k) {

        StringBuilder str = new StringBuilder("0");
        StringBuilder temp = new StringBuilder();

        for(int i=2; i<=n; i++){
            temp = new StringBuilder(str);
            invert(temp);
            temp.reverse();
            str = new StringBuilder(str + "1" + temp);
        }
//        System.out.println(str);

        return str.charAt(k-1);
    }

    static void invert(StringBuilder str){
        for(int i=0;i <str.length(); i++){
            if(str.charAt(i) == '0'){
                str.setCharAt(i,'1');
            } else{
                str.setCharAt(i,'0');
            }
        }
    }

    static String reverse(String str){
        String ans = "";
        for(int i=str.length()-1; i>=0; i--){
            ans += str.charAt(i);
        }

        return ans;
    }
}
