/* URL : https://leetcode.com/problems/cells-with-odd-values-in-a-matrix/ */
class Solution {
    public int oddCells(int m, int n, int[][] indices) {
        int[][] array = new int[m][n];
        int len = indices.length;
        int row,col;
        for(int i = 0; i < len; i++){
            row = indices[i][0];
            col = indices[i][1];
            //for row
            for(int j = 0; j < n; j++){
                array[row][j]++;
            }
            //for col
            for(int k = 0; k < m; k++){
                array[k][col]++;
            }
        }
        int sum = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(array[i][j] % 2 != 0){
                    sum++;
                }
            }
        }
        return sum;
    }
}
