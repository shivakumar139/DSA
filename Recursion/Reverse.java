package Recursion;

public class Reverse {
    static int ans = 0;
    public static void main(String[] args) {
        reverse(123456);
        System.out.println(ans);
    }
    static void reverse(int n){
        if(n==0)
            return;
        int lastDigit = n%10;
        ans = (ans*10 + lastDigit);
        reverse(n/10);
    }
}
