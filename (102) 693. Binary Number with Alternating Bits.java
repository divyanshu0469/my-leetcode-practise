/* URL : https://leetcode.com/problems/binary-number-with-alternating-bits/description/ */
class Solution {
    public boolean hasAlternatingBits(int n) {
        int digit1;
        int digit2;
        while (n != 0) {
            digit1 = n & 1;
            n >>= 1;
            digit2 = n & 1;
            if (digit1+digit2 != 1) {
                return false;
            }
        }
        return true;
    }
}
