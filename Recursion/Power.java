package Recursion;

public class Power {
    public static void main(String[] args) {
        System.out.println(power(3,3,1));
    }
    static int power(int a, int b, int ans){
        if(b <= 0){
            return ans;
        }
        return power(a, b-1, a*ans);
    }
}
