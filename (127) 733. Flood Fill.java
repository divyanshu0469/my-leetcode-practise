/* URL : https://leetcode.com/problems/flood-fill/description/ */
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
         rec(image, sr, sc, color, image[sr][sc]);
         return image;
    }
    public void rec(int[][] image, int sr, int sc, int color, int og) {
        if(sr < 0 || sc < 0 || sr > image.length-1 || sc > image[0].length-1 || image[sr][sc] != og || image[sr][sc] == color) { return; }
        image[sr][sc] = color;//current position
        rec(image, sr, sc-1, color, og);//left
        rec(image, sr-1, sc, color, og);//top
        rec(image, sr, sc+1, color, og);//right
        rec(image, sr+1, sc, color, og);//bottom
    }
}
