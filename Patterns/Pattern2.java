package Patterns;
/*
   1
  212
 32123
4321234
 */
public class Pattern2 {
    public static void main(String[] args) {
        pattern(4);
    }
    static void pattern(int n){

        for (int row = 1; row <= n; row++) {
            int col = row;
            for (int spaces = 1; spaces <= n-col; spaces++) {
                System.out.print(" ");
            }
            while(col>1){
                System.out.print(col);
                col--;
            }
            while(col<=row){
                System.out.print(col);
                col++;
            }
            System.out.println();
        }
    }
}
