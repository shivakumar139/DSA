package Array;

import java.util.*;
//55
public class HappyNumber {
    public static void main(String[] args) {
        System.out.println(isHappyCycle(19));
    }


    static boolean isHappyCycle(int n){
        int s = n, f = n;

        do{
            s = square(s);
            f = square(f);
            f = square(f);
            if(s == 1){
                return true;
            }

        }while(s != f);

        return false;

    }

    static int square(int num){
        int ans = 0;
        while(num > 0){
            long rem = num % 10;
            ans += Math.pow(rem, 2);
            num = num / 10;
        }

        return ans;
    }

    static boolean isHappy(int n) {
        HashSet present = new HashSet<Integer>();

        long num = n;
        long ans = 0;

        do{
//            System.out.println(present.contains());
            while(num > 0){
                long rem = num % 10;
//                System.out.println("rem: " + rem);
                ans += Math.pow(rem, 2);
                num = num / 10;
            }
//            System.out.println(ans);

            if(ans == 1){
                return true;
            }
            num = ans;
            ans = 0;

            present.add(ans);
        }while(present.contains(num) == false);
        return false;
    }
}
