package Backtracking;

import java.util.Arrays;

public class Maze {
    public static void main(String[] args) {
//        System.out.println(pathCount(3,3));

//        pathPrint("",3,3);

//        pathPrintDiagonal("",3,3);
        boolean[][] board = {
                {false, false, false},
                {false, false, false},
                {false, false, false}
        };
        int[][] path = new int[board.length][board[0].length];

//        mazeWithObsticals(board, "", 0, 0);
//        mazeWithObsticalsAll(board, "",0,0);
        mazeWithObsticalsAllPath(board,"",0,0, path, 1);



    }




    // counting no of paths
    static int pathCount(int r, int c){
        if(r == 1 || c == 1){
            return 1;
        }


        int count = 0;
        //down call
        if(r>1){
            count += pathCount(r-1, c);
        }

        //right call
        if(c>1){
            count += pathCount(r, c-1);
        }

        return count;
    }


    // printing all paths
    static void pathPrint(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        if(r>1){
            pathPrint(p+"D",r-1, c);
        }

        //right call
        if(c>1){
            pathPrint(p+"R",r, c-1);
        }

    }

    // printing all paths using diagonal path
    static void pathPrintDiagonal(String p, int r, int c){
        if(r == 1 && c == 1){
            System.out.println(p);
            return;
        }

        // Diagonal path
        if(r>1 && c>1){
            pathPrintDiagonal(p+"D", r-1, c-1);
        }

        // Down path
        if(r>1){
            pathPrintDiagonal(p+"V",r-1, c);
        }

        //right call
        if(c>1){
            pathPrintDiagonal(p+"H",r, c-1);
        }

    }


    // Maze with opsticals
    static void mazeWithObsticals(boolean[][] board, String path, int row, int col){
        if(row == board.length-1 && col == board[0].length-1){
            System.out.println(path);
            return;
        }

        // check whether this (row,col) location have river
        if(board[row][col]){
            return;
        }

        // down call
        if(row < board.length-1){
            mazeWithObsticals(board, path+"D", row+1, col);
        }

        // right call
        if(col < board[0].length-1){
            mazeWithObsticals(board, path+"R", row, col+1);
        }

    }


    // maze with all directions
    static void mazeWithObsticalsAll(boolean[][] board, String path, int row, int col){
        if(row == board.length-1 && col == board[0].length-1){
            System.out.println(path);
            return;
        }

        // check whether this (row,col) is visited or not if you are visited then return
        if(board[row][col]){
            return;
        }


        // mark true to visited location
        board[row][col] = true;

        //up call
        if (row>0){
            mazeWithObsticalsAll(board, path+"U", row-1, col);
        }

        // left call
        if(col > 0){
            mazeWithObsticalsAll(board, path+"L", row, col-1);
        }

        // down call
        if(row < board.length-1){
            mazeWithObsticalsAll(board, path+"D", row+1, col);
        }

        // right call
        if(col < board[0].length-1){
            mazeWithObsticalsAll(board, path+"R", row, col+1);
        }


        board[row][col] = false;
    }



    // maze with all directions
    static void mazeWithObsticalsAllPath(boolean[][] board, String p, int row, int col, int[][] path, int step){
        if(row == board.length-1 && col == board[0].length-1){
            path[row][col] = step;
//            System.out.println(Arrays.deepToString(path));
            for(int[] pathRow: path){
                System.out.println(Arrays.toString(pathRow));
            }
            System.out.println(p);
            return;
        }

        // check whether this (row,col) is visited or not if you are visited then return
        if(board[row][col]){
            return;
        }


        // mark true to visited location
        board[row][col] = true;
        path[row][col] = step;

        //up call
        if (row>0){
            mazeWithObsticalsAllPath(board, p+"U", row-1, col, path, step+1);
        }

        // left call
        if(col > 0){
            mazeWithObsticalsAllPath(board, p+"L", row, col-1, path, step+1);
        }

        // down call
        if(row < board.length-1){
            mazeWithObsticalsAllPath(board, p+"D", row+1, col, path, step+1);
        }

        // right call
        if(col < board[0].length-1){
            mazeWithObsticalsAllPath(board, p+"R", row, col+1, path, step+1);
        }


        board[row][col] = false;
        path[row][col] = 0;

    }
}
