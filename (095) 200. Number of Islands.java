/* URL : https://leetcode.com/problems/number-of-islands/description/ */
class Solution {
    public void makeIslandZero(char[][] grid, int i, int j) {
        if (i >= 0 && j >= 0 && i < grid.length && j < grid[0].length && grid[i][j] == '1') {
            grid[i][j] = '0';
            //top
            makeIslandZero(grid, i-1, j);
            //right
            makeIslandZero(grid, i, j+1);
            //bottom
            makeIslandZero(grid, i+1, j);
            //left
            makeIslandZero(grid, i, j-1);
        } else {
            return;
        }
    }
    public int numIslands(char[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == '1') {
                    count++;
                    makeIslandZero(grid, i, j);
                }
            }
        }
        return count;
    }

}
