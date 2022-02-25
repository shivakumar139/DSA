package Patterns;
//                *
//               * *
//              * * *
//             * * * *
//            * * * * *
//             * * * *
//              * * *
//               * *
//                *
public class Pattern1 {
    public static void main(String[] args) {
//        pattern(10);
        patternSingleLoop(5);
    }
    static void pattern(int n){

        for (int row = 0; row < n; row++) {
            for (int col = 0; col <= row; col++) {
                System.out.print("*");
            }
            System.out.println();

        }

        for (int row = 0; row < n-1; row++) {
            for (int col = 0; col < n-row-1; col++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    static void patternSingleLoop(int n){
        for (int row = 0; row < 2*n; row++) {
            int totalCol = row>n?2*n-row:row;

            int spaces = n-totalCol;
            for (int col = 0; col < spaces; col++) {
                System.out.print(" ");
            }
            for (int col = 0; col < totalCol; col++) {
                System.out.print("* ");
            }
            System.out.println();

        }
    }
}