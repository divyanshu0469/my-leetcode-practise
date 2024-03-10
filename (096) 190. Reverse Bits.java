/* URL : https://leetcode.com/problems/reverse-bits/description/ */
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        int bit;
        for (int i = 0; i < 32; i++) {
            bit = (n >> i) & 1;
            result = result | (bit << 31-i);
        }
        return result;
    }
}
