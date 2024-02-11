/* URL : https://leetcode.com/problems/container-with-most-water/description/ */
class Solution {
    public int maxArea(int[] height) {
        int maxHeight = 0;
        int i = 0;
        int j = height.length -1;
        while (i < j) {
            int length = Math.min(height[i], height[j]) ;
            int breadth = j - i;
            if (maxHeight < (length * breadth)) {
                maxHeight = (length * breadth);
            }
            if (height[i] < height[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxHeight;
    }
}
