package Backtracking;

public class NQueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }

    private static int queens(boolean[][] board, int row) {
        if(row == board.length){
            displayBoard(board);
            System.out.println();
            return 1;
        }

        int count = 0;
        for(int col = 0; col<board.length; col++){
            if(isSafe(board, row, col)){
                board[row][col] = true;
                count += queens(board, row+1);
                board[row][col] = false;
            }
        }

        return count;
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        //up direction
        for(int i=row; i>=0; i--){
            if(board[i][col]){
                return false;
            }
        }

        // left Direction
        int maxLeft = Math.min(row,col);
        for(int i=maxLeft; i>=0; i--){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // right Direction
        int maxRight = Math.min(row,(board.length -1)-col);
        for(int i=maxRight; i>=0; i--){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }

    private static void displayBoard(boolean[][] board) {

        for(boolean[] row: board){
            for(boolean col: row){
                if(col){
                    System.out.print("Q ");
                } else{
                    System.out.print("- ");
                }
            }
            System.out.println();
        }
    }
}
