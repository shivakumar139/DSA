package Recursion;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(11111111));
    }

    private static int sumOfDigits(int n) {
        if(n==0){
            return 0;
        }
        int lastDigit = n % 10;
        return lastDigit + sumOfDigits(n/10);
    }
}
