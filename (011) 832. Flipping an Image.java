/* URL : https://leetcode.com/problems/flipping-an-image/ */
import java.util.Arrays;
class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = row;
        int[][] array = new int[row][col];
        int row1 = 0;
        for (int i = 0; i < row; i++){
            int col1 = 0;
            for(int j = col-1; j >= 0; j--){
                array[row1][col1] = image[i][j];
                col1++;
            }
            row1++;
        }
        for (int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                array[i][j] = array[i][j] == 1 ? 0 : 1;
            }
        }
        return array;
    }
}
