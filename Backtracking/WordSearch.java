package Backtracking;

import java.util.*;

public class WordSearch {
    public static void main(String[] args) {
        char[][] board = {{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}};
        String word = "FCSE";

        System.out.println(exist(board,word));
//        for(boolean[] row: isVisited)
//        System.out.println(Arrays.toString(row));
    }

    static boolean exist(char[][] board, String word) {
        boolean[][] isVisited = new boolean[board.length][board[0].length];

        boolean ans = false;
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[0].length; col++) {
                if(board[row][col] == word.charAt(0)){
//                    System.out.println("row " + row + " col " + col );
                    ans = ans || backtrack(board, word,0 ,isVisited ,row, col);
//                    isVisited = new boolean[board.length][board[0].length];
                }
            }
        }

        return ans;
    }

    static boolean backtrack(char[][] board, String word,int i, boolean [][] isVisited, int row, int col){
        if(i == word.length()){
            return true;
        }

        if(row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(i) || isVisited[row][col]){
            return false;
        }

        // mark location as visited
        isVisited[row][col] = true;

        boolean ans = false;
        ans = ans || backtrack(board, word, i+1, isVisited, row+1, col);
        ans = ans || backtrack(board, word, i+1, isVisited, row-1, col);
        ans = ans || backtrack(board, word, i+1, isVisited, row, col+1);
        ans = ans || backtrack(board, word, i+1, isVisited, row, col-1);

        isVisited[row][col] = false;

        return ans;
    }
}
