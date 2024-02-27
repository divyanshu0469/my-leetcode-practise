/* URL : https://leetcode.com/problems/n-queens/description/ */
class Solution {
    public List<List<String>> ans = new ArrayList<List<String>>();

    public int count = 0;

    public boolean isSafe (int[][] board, int row, int col) {
        //for top
        int tempRow = row;
        int tempCol = col;
        while (tempRow >= 0) {
            if(board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
        }
        
        //for top left
        tempRow = row;
        tempCol = col;
        while (tempRow >= 0 && tempCol >= 0) {
            if (board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
            tempCol--;
        }

        //for top right
        tempRow = row;
        tempCol = col;
        while (tempRow >= 0 && tempCol <= board.length-1) {
            if (board[tempRow][tempCol] == 1) {
                return false;
            }
            tempRow--;
            tempCol++;
        }
        return true;
    }

    public void putInList(int[][] board, List<List<String>> ans) {
        List<String> al = new ArrayList<String>();
        ans.add(al);
        for (int i = 0; i < board.length; i++) {
            StringBuilder sb = new StringBuilder();
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 0) sb.append(".");
                else sb.append("Q");
            }
            String s = new String(sb);
            ans.get(count).add(s);
        }
        count++;
    }

    public void placeInRow (int[][] board, int row) {
        if (row >= board.length) {
            //solution found
            putInList(board, ans);
            return;
        }
        for (int col = 0; col < board.length; col++) {
            if (isSafe(board, row, col)) {
                board[row][col] = 1;
                placeInRow(board, row+1);
                board[row][col] = 0;
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        int[][] board = new int[n][n];
        placeInRow(board, 0);
        return ans;
    }
}
