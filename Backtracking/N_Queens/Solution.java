package Backtracking.N_Queens;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    private boolean isSafe(int n, char[][] nQueens, int row,int col){
        // Check in same column for any queen
        for (int i = 0; i < n; i++) {
            if (nQueens[i][col] == 'Q') {
                return false;
            }  
        }
        // Check in upper left diagonal for any queen
        for(int i = row - 1, j = col -1;i>=0 && j>=0; i--,j--){
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        // Check in upper right diagonal for any queen
        for(int i = row - 1,j = col + 1; i >= 0 && j<n ;i--,j++){
            if (nQueens[i][j] == 'Q') {
                return false;
            }
        }
        // if no comflicts found, position is safe
        return true;
    }
      // Recursive helper function to solve N-Queens problem
    private void solveNQueens(int n, List<List<String>> output,char[][] nQueens,int row){
        // Base case if all queens placed in all  rows
        if (row == n) {
            List<String> solution = new ArrayList<>();
            for (char[] rowArray : nQueens) {
                solution.add(new String(rowArray));
            }
            output.add(solution);
            return;
        }
        // try placing queen in each column of current row
        for (int col = 0; col < n; col++) {
            //if current position is safe
            if (isSafe(n, nQueens, row, col)) {
                //place queen
                nQueens[row][col] = 'Q';
                //Recursively solve for nect row
                solveNQueens(n,output,nQueens,row+1);
                // Backtrack: remove queen for trying next position
                nQueens[row][col] = '.';
            }
        }
    }
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> output = new ArrayList<>();// Store all valid solution
        char[][] nQueens = new char[n][n]; // Initialize empty board
        // Fill the board with dots
        for (int i = 0; i < n; i++) {
            Arrays.fill(nQueens[i], '.');
        }
        solveNQueens(n,output,nQueens,0); // Start solving from row 0
        return output;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 4; // Change this value to test for different board sizes
        List<List<String>> result = solution.solveNQueens(n);

        System.out.println("Solutions for " + n + "-Queens Problem:");
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
