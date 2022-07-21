package Recursion;

import java.util.Arrays;

public class Recursion {
    public static void main(String[] args) {
        solve(3);
    }

    private static void solve(int x) {
        if(x == 0){
            System.out.println(x + " if");
            return;
        }
        System.out.println(x + " above");
        solve(x-1);
        System.out.println(x + " below");

    }
}
