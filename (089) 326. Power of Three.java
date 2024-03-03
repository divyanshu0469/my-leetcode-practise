/* URL : https://leetcode.com/problems/power-of-three/description/ */
class Solution {
    public boolean checker(int n) {
        if (n == 1) {
            return true;
        } else if (n%3 != 0 || n <= 0) {
            return false;
        }
        return checker(n/3);
    }
    public boolean isPowerOfThree(int n) {
        return checker(n);
    }
}
