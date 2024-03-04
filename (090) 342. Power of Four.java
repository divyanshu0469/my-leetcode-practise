/* URL : https://leetcode.com/problems/power-of-four/description/ */
class Solution {
    public boolean checker(int n) {
        if (n == 1) {
            return true;
        } else if (n%4 != 0 || n <= 0) {
            return false;
        }
        return checker(n/4);
    }
    public boolean isPowerOfFour(int n) {
        return checker(n);
    }
}
