package Recursion;

public class Pattern {
    public static void main(String[] args) {
//        pattern1(3);
        pattern2(4,0);
    }

    private static void pattern2(int rows, int col) {
        if(col==rows)
            return;
        for(int i=0; i<=col; i++)
            System.out.print("*");
        System.out.println();
        pattern2(rows,col+1);

    }

    private static void pattern1(int n) {
        if(n==0)
            return;
        for(int i=0; i<n; i++)
            System.out.print("*");
        System.out.println();
        pattern1(n-1);
    }
}
