/* URL : https://leetcode.com/problems/matrix-diagonal-sum/ */
class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        if(n == 1){
            sum = mat[0][0];
            return sum;
        }
        int j = n-1;
        for(int i = 0; i < n; i++){
            //for primary diagonal sum
            sum = sum + mat[i][i];
            //for secondary diagonal sum
            sum = sum + mat[i][j];
            j--;
        }
        int mid;
        if(n % 2 != 0){
            mid = n/2;
            //remove duplicate
            sum = sum - mat[mid][mid];
        }
        return sum;
    }
}
