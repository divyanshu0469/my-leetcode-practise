/* URL : https://leetcode.com/problems/check-knight-tour-configuration/description/ */
class Solution {
    public boolean checker(int[][] grid, int row, int col, int currentValue) {
        //grid boundary
        if (row < 0 || col < 0 || row > grid.length-1 || col > grid.length-1) {
            return false;
        }
        //incorrect value
        int value = grid[row][col];
        if (value != currentValue+1) {
            return false;
        }
        if (value == (grid.length*grid.length)-1) {
            return true;
        }
        
        if (//top left
            checker(grid, row-1, col-2, value) ||
            checker(grid, row-2, col-1, value) ||
            //top right 
            checker(grid, row-1, col+2, value) ||
            checker(grid, row-2, col+1, value) ||
            //bottom right
            checker(grid, row+1, col+2, value) ||
            checker(grid, row+2, col+1, value) ||
            //bottom left
            checker(grid, row+1, col-2, value) ||
            checker(grid, row+2, col-1, value) ) {
            return true;
        } else{
        return false;
        }
    }
    public boolean checkValidGrid(int[][] grid) {
        return checker(grid, 0, 0, -1);
    }
}
