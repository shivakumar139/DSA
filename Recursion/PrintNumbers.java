package Recursion;

public class PrintNumbers {
    public static void main(String[] args) {
        nto1(5);
        oneton(5);
    }

    private static void oneton(int n) {
        if(n==0)
            return;
        oneton(n-1);
        System.out.println(n);
    }

    private static void nto1(int n) {
        if(n==0)
            return;
        System.out.println(n);
        nto1(n-1);
    }
}
