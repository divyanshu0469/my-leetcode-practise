/* URL : https://leetcode.com/problems/number-complement/description/ */
class Solution {
    public int findComplement(int num) {
        int numLen = (int) (Math.log(num) / Math.log(2)) + 1;
        int bitmask = (1 << numLen) - 1;
        return num ^ bitmask;
    }
}
