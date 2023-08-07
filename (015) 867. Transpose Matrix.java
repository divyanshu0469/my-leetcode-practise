/* URL : https://leetcode.com/problems/transpose-matrix/ */
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int col = matrix[0].length;
        int[][] array =  new int[col][row];

        for(int i = 0; i < col; i++){
            for(int j = 0; j < row; j++){
                array[i][j] = matrix[j][i];
            }
        }
        return array;
    }
}
