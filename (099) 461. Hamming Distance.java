/* URL : https://leetcode.com/problems/hamming-distance/description/ */
class Solution {
    public int hammingDistance(int x, int y) {
        int hd = 0;
        while (x != 0 || y != 0) {
            if ((x & 1) != (y & 1)) {
                hd++;
            }
            x = x >> 1;
            y = y >> 1;
        }
        return hd;
    }
}
