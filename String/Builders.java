package String;

import java.util.Locale;

public class Builders{
    public static void main(String[] args) {
//        System.out.println(args.length);
//        int q = 'q';  // 1
//        char ch2 = (char)q; // 2
//        short s = 1;  // 3
//        char ch3 = (char)s; // 4
        System.out.println(gcd(1,1));
        System.out.println(gcd(3,7));
        System.out.println(gcd(1,3));
        System.out.println(gcd(3,6));
        System.out.println(gcd(6,2));
        System.out.println(gcd(4,6));
    }
    public static int gcd(int a, int b) {
        while (b > 0) {
            int c = a % b;
            a = b;
            b = c;
        }
        return a;
    }


    static public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        System.out.println(s);


        StringBuilder builder = new StringBuilder();

        for(int i=0;i<s.length();i++){
//            if(s.charAt(i)>='a' && s.charAt(i)<='z')
                builder.append(s.charAt(i));
        }


        System.out.println(builder);
        String b = builder.toString();
        builder.reverse();

        return b.equals(builder.toString());
    }
}
