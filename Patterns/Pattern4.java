package Patterns;

public class Pattern4 {
    public static void main(String[] args) {
        pattern(6);
    }
    static void pattern(int n){
        n = 2*n-1;
        for (int row = 1; row < n; row++) {
            for (int col = 1; col < n; col++) {
                int c = Math.max(Math.max(row,col),Math.max(n-row+1,n-col+1))/2;
                System.out.print(c + " ");
            }

            System.out.println();
        }
    }
}
