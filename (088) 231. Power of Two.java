/* URL : https://leetcode.com/problems/power-of-two/description/ */
class Solution {
    public boolean checker(int n) {
        if (n == 1) {
            return true;
        }
        if (n%2 != 0 || n <= 0) {
            return false;
        }
        return checker(n/2);
    }
    public boolean isPowerOfTwo(int n) {
        return checker(n);
    }
}
