/* URL : https://leetcode.com/problems/valid-perfect-square/ */
class Solution {
    public boolean isPerfectSquare(int num) {
        //range from start (1) to end (num)
        int start = 1;
        int end = num;
        while (start <= end) {
            long mid = (start + end) >>> 1;
            if (mid * mid == num) {
                return true;
            } else if (mid * mid < num) {
                start = (int) mid + 1;
            } else {
                end = (int) mid - 1;
            }
        }
        return false;
    }
}
