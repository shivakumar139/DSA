package Backtracking;

public class KthSymbolGrammer {
    public static void main(String[] args) {

        System.out.println(kthGrammar(2,2));

    }
    static int kthGrammar(int n, int k) {

        StringBuilder firstPart = new StringBuilder();
        StringBuilder secondPart = new StringBuilder("0");
        for(int i=2; i<=n; i++){
            firstPart = firstPart.append(secondPart);
            secondPart = invert(new StringBuilder(firstPart));
        }

        System.out.println(firstPart + " " + secondPart);

        if(k > firstPart.length()){
            k = k % firstPart.length();
            k = k==0?k+1:k;
            return secondPart.charAt(k-1) - '0';
        }
        return firstPart.charAt(k-1) - '0';
    }

    static StringBuilder invert(StringBuilder str){
        for(int i=0;i <str.length(); i++){
            if(str.charAt(i) == '0'){
                str.setCharAt(i,'1');
            } else{
                str.setCharAt(i,'0');
            }
        }

        return str;
    }
}
