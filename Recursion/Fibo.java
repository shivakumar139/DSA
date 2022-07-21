package Recursion;

import java.math.BigInteger;

public class Fibo {
    public static void main(String[] args) {
//        int a = 0,b=1,ans=0;

        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger ans = new BigInteger("0");

        int n = 3;
        for(int i=1;i<n;i++){
            ans = a.add(b);
            a = b;
            b=ans;
        }
        System.out.println(ans);


    }
}
