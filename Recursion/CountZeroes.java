package Recursion;

public class CountZeroes {
    public static void main(String[] args) {
        System.out.println(count(10600));
    }

    private static int count(int n) {
        if(n==0)
            return 0;
        
        int ans = 0;
        if(n%10==0)
             ans = 1;
        return ans + count(n/10);
    }
}
