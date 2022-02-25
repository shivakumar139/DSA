package Patterns;

/*
        1
      2 1 2
    3 2 1 2 3
  4 3 2 1 2 3 4
5 4 3 2 1 2 3 4 5
  4 3 2 1 2 3 4
    3 2 1 2 3
      2 1 2
        1
 */
public class Pattern3 {
    public static void main(String[] args) {
        pattern(5);
    }
    static void pattern(int n){
        for (int row = 1; row <= 2*n; row++) {
            int col = row>n?2*n-row:row;
            for (int spaces = 1; spaces <= n-col; spaces++) {
                System.out.print("  ");
            }
            for(int i=col; i>=1; i--){
                System.out.print(i + " ");
            }
            for(int i=2; i<=col; i++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
